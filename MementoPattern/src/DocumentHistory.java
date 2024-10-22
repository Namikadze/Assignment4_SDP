package memento;
import java.util.Stack;
public class DocumentHistory {
    private Stack<Memento> history = new Stack<>();
    public void save(Document doc) {
        history.push(doc.save());
    }
    public void undo(Document doc) {
        if (!history.isEmpty()) {
            doc.restore(history.pop());
        }
    }
}
