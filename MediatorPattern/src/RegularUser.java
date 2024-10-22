package user;
import mediator.ChatMediator;
public class RegularUser extends User {
    public RegularUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }
    @Override
    public void sendMessage(String message) {
        System.out.println(this.name + " (Regular) sends: " + message);
        mediator.sendMessage(message, this);
    }
    @Override
    public void receiveMessage(String message) {
        System.out.println(this.name + " (Regular) receives: " + message);
    }
}
