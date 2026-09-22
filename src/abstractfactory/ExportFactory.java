package abstractfactory;

import abstractfactory.product.Footer;
import abstractfactory.product.Header;
import abstractfactory.product.Table;

/**
 * AbstractFactory: one create-method per product in the family.
 * A concrete factory returns products that all belong to the SAME format.
 */
public interface ExportFactory {

    Header createHeader();

    Table createTable();

    Footer createFooter();
}
