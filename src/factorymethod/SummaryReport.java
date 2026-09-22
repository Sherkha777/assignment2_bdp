package factorymethod;

/** ConcreteProduct: short executive overview. */
public class SummaryReport implements Report {

    @Override
    public String title() {
        return "Executive Summary";
    }

    @Override
    public String body() {
        return "Quarter closed above target. Two audit findings remain open.";
    }
}
