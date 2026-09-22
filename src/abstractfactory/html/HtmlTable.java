package abstractfactory.html;

import abstractfactory.product.Table;
import java.util.ArrayList;
import java.util.List;

class HtmlTable implements Table {

    @Override
    public String render(List<String> columns, List<List<String>> rows) {
        List<String> lines = new ArrayList<>();
        lines.add("<table>");
        lines.add(row("th", columns));
        for (List<String> cells : rows) {
            lines.add(row("td", cells));
        }
        lines.add("</table>");
        return String.join(System.lineSeparator(), lines);
    }

    private String row(String cellTag, List<String> cells) {
        StringBuilder row = new StringBuilder("  <tr>");
        for (String cell : cells) {
            row.append("<").append(cellTag).append(">")
               .append(cell)
               .append("</").append(cellTag).append(">");
        }
        return row.append("</tr>").toString();
    }
}
