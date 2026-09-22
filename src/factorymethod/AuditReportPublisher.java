package factorymethod;

/** ConcreteCreator for {@link AuditReport}. */
public class AuditReportPublisher extends ReportPublisher {

    @Override
    protected Report createReport() {
        return new AuditReport();
    }
}
