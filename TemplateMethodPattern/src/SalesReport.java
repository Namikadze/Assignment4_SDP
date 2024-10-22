package template;
public class SalesReport extends ReportGenerator {
    @Override
    protected void gatherData() {
        System.out.println("Gathering sales data...");
    }
    @Override
    protected void formatReport() {
        System.out.println("Formatting sales report...");
    }
}
