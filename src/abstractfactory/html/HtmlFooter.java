package abstractfactory.html;

import abstractfactory.product.Footer;

class HtmlFooter implements Footer {

    @Override
    public String render(String note) {
        return "<footer>" + note + "</footer>";
    }
}
