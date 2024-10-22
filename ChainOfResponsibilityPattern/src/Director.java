package chain;
import request.ExpenseRequest;
public class Director extends Approver {
    @Override
    public void approveRequest(ExpenseRequest request) {
        if (request.getAmount() <= 10000) {
            System.out.println("Director approved request of $" + request.getAmount());
        } else if (nextApprover != null) {
            nextApprover.approveRequest(request);
        }
    }
}
