package abstractfactory.pdf;

import abstractfactory.product.Footer;

class PdfFooter implements Footer {

    @Override
    public String render(String note) {
        return "[PDF-FOOTER] " + note + " - page 1";
    }
}
