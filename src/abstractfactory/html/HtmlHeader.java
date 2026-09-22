package abstractfactory.html;

import abstractfactory.product.Header;

class HtmlHeader implements Header {

    @Override
    public String render(String title) {
        return "<h1>" + title + "</h1>";
    }
}
