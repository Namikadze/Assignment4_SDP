import template.*;
public class Main {
    public static void main(String[] args) {
        ReportGenerator salesReport = new SalesReport();
        salesReport.generateReport();
        ReportGenerator employeeReport = new EmployeeReport();
        employeeReport.generateReport();
    }
}
