package abstractfactory.pdf;

import abstractfactory.ExportFactory;
import abstractfactory.product.Footer;
import abstractfactory.product.Header;
import abstractfactory.product.Table;

/** ConcreteFactory: every product it creates is PDF-flavoured. */
public class PdfExportFactory implements ExportFactory {

    @Override
    public Header createHeader() {
        return new PdfHeader();
    }

    @Override
    public Table createTable() {
        return new PdfTable();
    }

    @Override
    public Footer createFooter() {
        return new PdfFooter();
    }
}
