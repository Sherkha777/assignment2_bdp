package abstractfactory.docx;

import abstractfactory.product.Footer;

class DocxFooter implements Footer {

    @Override
    public String render(String note) {
        return "<w:ftr>" + note + "</w:ftr>";
    }
}
