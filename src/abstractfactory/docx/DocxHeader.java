package abstractfactory.docx;

import abstractfactory.product.Header;

class DocxHeader implements Header {

    @Override
    public String render(String title) {
        return "<w:p style=\"Heading1\">" + title + "</w:p>";
    }
}
