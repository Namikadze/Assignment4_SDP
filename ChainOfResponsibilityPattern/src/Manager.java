package chain;
import request.ExpenseRequest;
public class Manager extends Approver {
    @Override
    public void approveRequest(ExpenseRequest request) {
        if (request.getAmount() <= 5000) {
            System.out.println("Manager approved request of $" + request.getAmount());
        } else if (nextApprover != null) {
            nextApprover.approveRequest(request);
        }
    }
}
