package state;
import order.Order;
public class PaidOrderState implements State {
    private Order order;
    public PaidOrderState(Order order) {
        this.order = order;
    }
    @Override
    public void payOrder() {
        System.out.println("Order is already paid.");
    }
    @Override
    public void shipOrder() {
        System.out.println("Order is shipped.");
        order.setState(new ShippedOrderState(order));
    }
    @Override
    public void deliverOrder() {
        System.out.println("Order can't be delivered before shipping.");
    }
    @Override
    public void cancelOrder() {
        System.out.println("Order can't be cancelled after payment.");
    }
}
