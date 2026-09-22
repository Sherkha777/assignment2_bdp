package factorymethod;

/** ConcreteProduct: compliance-focused report for auditors. */
public class AuditReport implements Report {

    @Override
    public String title() {
        return "Audit Report";
    }

    @Override
    public String body() {
        return "Checks passed: 48/50 | Open findings: 2 | Risk level: MEDIUM";
    }
}
