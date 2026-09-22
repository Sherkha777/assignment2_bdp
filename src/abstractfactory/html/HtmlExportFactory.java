package abstractfactory.html;

import abstractfactory.ExportFactory;
import abstractfactory.product.Footer;
import abstractfactory.product.Header;
import abstractfactory.product.Table;

/** ConcreteFactory: every product it creates is HTML-flavoured. */
public class HtmlExportFactory implements ExportFactory {

    @Override
    public Header createHeader() {
        return new HtmlHeader();
    }

    @Override
    public Table createTable() {
        return new HtmlTable();
    }

    @Override
    public Footer createFooter() {
        return new HtmlFooter();
    }
}
