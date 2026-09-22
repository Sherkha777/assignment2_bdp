package abstractfactory.pdf;

import abstractfactory.product.Header;

class PdfHeader implements Header {

    @Override
    public String render(String title) {
        return "[PDF-HEADER] " + title;
    }
}
