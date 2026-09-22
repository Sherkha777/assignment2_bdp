package abstractfactory.docx;

import abstractfactory.ExportFactory;
import abstractfactory.product.Footer;
import abstractfactory.product.Header;
import abstractfactory.product.Table;

/** ConcreteFactory: every product it creates is DOCX-flavoured. */
public class DocxExportFactory implements ExportFactory {

    @Override
    public Header createHeader() {
        return new DocxHeader();
    }

    @Override
    public Table createTable() {
        return new DocxTable();
    }

    @Override
    public Footer createFooter() {
        return new DocxFooter();
    }
}
