import mediator.*;
import user.*;
public class Main {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatRoom();
        User user1 = new RegularUser(chatMediator, "John");
        User user2 = new PremiumUser(chatMediator, "Alice");
        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        user1.sendMessage("Hello, Alice!");
        user2.sendMessage("Hey, John!");
    }
}
