package abstractfactory.docx;

import abstractfactory.product.Table;
import java.util.ArrayList;
import java.util.List;

class DocxTable implements Table {

    @Override
    public String render(List<String> columns, List<List<String>> rows) {
        List<String> lines = new ArrayList<>();
        lines.add("<w:tbl>");
        lines.add(row(columns));
        for (List<String> cells : rows) {
            lines.add(row(cells));
        }
        lines.add("</w:tbl>");
        return String.join(System.lineSeparator(), lines);
    }

    private String row(List<String> cells) {
        StringBuilder row = new StringBuilder("  <w:tr>");
        for (String cell : cells) {
            row.append("<w:tc>").append(cell).append("</w:tc>");
        }
        return row.append("</w:tr>").toString();
    }
}
