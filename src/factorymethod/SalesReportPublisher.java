package factorymethod;

/** ConcreteCreator for {@link SalesReport}. */
public class SalesReportPublisher extends ReportPublisher {

    @Override
    protected Report createReport() {
        return new SalesReport();
    }
}
