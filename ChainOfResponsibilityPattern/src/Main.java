import chain.*;
import request.ExpenseRequest;
public class Main {
    public static void main(String[] args) {
        Approver teamLead = new TeamLead();
        Approver manager = new Manager();
        Approver director = new Director();
        Approver ceo = new CEO();
        teamLead.setNextApprover(manager);
        manager.setNextApprover(director);
        director.setNextApprover(ceo);
        ExpenseRequest request = new ExpenseRequest(12000, "New project funding");
        teamLead.approveRequest(request);
    }
}
