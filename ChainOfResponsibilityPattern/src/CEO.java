package chain;
import request.ExpenseRequest;
public class CEO extends Approver {
    @Override
    public void approveRequest(ExpenseRequest request) {
        System.out.println("CEO approved request of $" + request.getAmount());
    }
}
