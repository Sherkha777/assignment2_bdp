package factorymethod;

import java.util.List;

/**
 * Client for Part A. It only knows {@link ReportPublisher}; it never calls
 * "new SalesReport()" (or any other concrete product).
 */
public class Main {

    public static void main(String[] args) {
        List<ReportPublisher> publishers = List.of(
                new SalesReportPublisher(),
                new AuditReportPublisher(),
                new SummaryReportPublisher());

        for (ReportPublisher publisher : publishers) {
            System.out.println(publisher.publish());
            System.out.println();
        }
    }
}
