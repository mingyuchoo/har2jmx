yieldUnescaped '<!DOCTYPE html>'
html(lang:'en') {
    head {
        meta('http-equiv':'"Content-Type" content="text/html; charset=utf-8"')
        title('Main')
        link(rel: 'stylesheet', href: '/css/bootstrap.min.css')
    }
    body {
        div(class: 'container') {
            h2('Upload HAR file here to convert JMX file.')
            div(class: 'input-group mb-3') {
                input(type: 'text', class: 'form-control', placeholder: 'HAR file path')
                div(class: 'input-group-append') {
                    button(class: 'btn btn-outline-secondary', type: 'button', 'Upload')
                }
            }
        }
        script(src: '/js/bootstrap.min.js')
        script(src: '/js/jquery-3.4.1.min.js')
    }
}