package factorymethod;

/** ConcreteProduct: numbers-focused report for the sales team. */
public class SalesReport implements Report {

    @Override
    public String title() {
        return "Sales Report";
    }

    @Override
    public String body() {
        return "Revenue: 120,000 | Orders: 342 | Top product: Espresso Machine";
    }
}
