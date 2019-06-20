package har2jmx

import groovy.cli.picocli.CliBuilder
import har2jmx.service.Har2jmx

def cli = new CliBuilder(usage: 'har2jmx -har [*.har] -jmx [*.jmx]', header: 'Options:')
cli.help('print this message.')
cli.har(args: 1, 'The har input file which could be converted to a JMeter JMX file.')
cli.jmx(args: 1, 'The jmx output file.')
cli.header(args: 1, 'Add the request header to the JMeter requests true or false (default true).')

def options = cli.parse(args)

if (options.help || !options.har || !options.jmx) {
    cli.usage()
    return
}

def withHttpHeaders = options.header ?: true

try {
    def har2jmx = new Har2jmx(withHttpHeaders: withHttpHeaders)
    har2jmx.convert(new File(options.har), new File(options.jmx))
} catch (Throwable exp) {
    println exp.message
}

