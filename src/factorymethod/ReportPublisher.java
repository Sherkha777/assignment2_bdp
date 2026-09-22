package factorymethod;

/**
 * Creator: declares the factory method and owns the business logic that USES
 * the product through the {@link Report} interface only.
 * Subclasses decide WHICH report is created (inheritance).
 */
public abstract class ReportPublisher {

    /** The factory method. */
    protected abstract Report createReport();

    /** Business method: works with any Report, never with a concrete one. */
    public String publish() {
        Report report = createReport();
        return heading(report) + System.lineSeparator() + report.body();
    }

    private String heading(Report report) {
        return "=== " + report.title().toUpperCase() + " ===";
    }
}
