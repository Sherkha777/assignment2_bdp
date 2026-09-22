package abstractfactory.pdf;

import abstractfactory.product.Table;
import java.util.ArrayList;
import java.util.List;

class PdfTable implements Table {

    @Override
    public String render(List<String> columns, List<List<String>> rows) {
        List<String> lines = new ArrayList<>();
        lines.add("[PDF-COLS] " + String.join(" | ", columns));
        for (List<String> row : rows) {
            lines.add("[PDF-ROW]  " + String.join(" | ", row));
        }
        return String.join(System.lineSeparator(), lines);
    }
}
