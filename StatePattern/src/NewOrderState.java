package state;
import order.Order;
public class NewOrderState implements State {
    private Order order;
    public NewOrderState(Order order) {
        this.order = order;
    }
    @Override
    public void payOrder() {
        System.out.println("Order is paid.");
        order.setState(new PaidOrderState(order));
    }
    @Override
    public void shipOrder() {
        System.out.println("Order can't be shipped before payment.");
    }
    @Override
    public void deliverOrder() {
        System.out.println("Order can't be delivered before payment and shipping.");
    }
    @Override
    public void cancelOrder() {
        System.out.println("Order is cancelled.");
        order.setState(new CancelledOrderState(order));
    }
}
