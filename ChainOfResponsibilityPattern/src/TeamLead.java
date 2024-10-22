package chain;
import request.ExpenseRequest;
public class TeamLead extends Approver {
    @Override
    public void approveRequest(ExpenseRequest request) {
        if (request.getAmount() <= 1000) {
            System.out.println("TeamLead approved request of $" + request.getAmount());
        } else if (nextApprover != null) {
            nextApprover.approveRequest(request);
        }
    }
}
