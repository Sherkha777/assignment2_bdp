package abstractfactory.product;

import java.util.List;

/** Abstract product #2 of the export family. */
public interface Table {

    String render(List<String> columns, List<List<String>> rows);
}
