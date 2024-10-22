package state;
import order.Order;
public class CancelledOrderState implements State {
    private Order order;
    public CancelledOrderState(Order order) {
        this.order = order;
    }
    @Override
    public void payOrder() {
        System.out.println("Order is cancelled and can't be paid.");
    }
    @Override
    public void shipOrder() {
        System.out.println("Order is cancelled and can't be shipped.");
    }
    @Override
    public void deliverOrder() {
        System.out.println("Order is cancelled and can't be delivered.");
    }
    @Override
    public void cancelOrder() {
        System.out.println("Order is already cancelled.");
    }
}
