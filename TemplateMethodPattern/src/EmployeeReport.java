package template;
public class EmployeeReport extends ReportGenerator {
    @Override
    protected void gatherData() {
        System.out.println("Gathering employee data...");
    }
    @Override
    protected void formatReport() {
        System.out.println("Formatting employee report...");
    }
}
