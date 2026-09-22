package abstractfactory;

import abstractfactory.product.Footer;
import abstractfactory.product.Header;
import abstractfactory.product.Table;
import java.util.List;

/**
 * Client: receives the factory by composition (constructor) and uses ONLY
 * the abstract product interfaces. It has no idea whether it produces
 * PDF, DOCX or HTML.
 */
public class ExportStudio {

    private final Header header;
    private final Table table;
    private final Footer footer;

    public ExportStudio(ExportFactory factory) {
        this.header = factory.createHeader();
        this.table = factory.createTable();
        this.footer = factory.createFooter();
    }

    public String export(String title, List<String> columns,
                         List<List<String>> rows, String footerNote) {
        return String.join(System.lineSeparator(),
                header.render(title),
                table.render(columns, rows),
                footer.render(footerNote));
    }
}
