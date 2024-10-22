package template;
public abstract class ReportGenerator {
    public final void generateReport() {
        gatherData();
        formatReport();
        printReport();
    }
    protected abstract void gatherData();
    protected abstract void formatReport();
    protected void printReport() {
        System.out.println("Printing the report...");
    }
}
