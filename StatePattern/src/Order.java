package order;
import state.*;
public class Order {
    private State state;
    public Order() {
        state = new NewOrderState(this);
    }
    public void setState(State state) {
        this.state = state;
    }
    public void payOrder() {
        state.payOrder();
    }
    public void shipOrder() {
        state.shipOrder();
    }
    public void deliverOrder() {
        state.deliverOrder();
    }
    public void cancelOrder() {
        state.cancelOrder();
    }
}
