package factorymethod;

/** ConcreteCreator for {@link SummaryReport}. */
public class SummaryReportPublisher extends ReportPublisher {

    @Override
    protected Report createReport() {
        return new SummaryReport();
    }
}
