import memento.*;
public class Main {
    public static void main(String[] args) {
        Document doc = new Document();
        DocumentHistory history = new DocumentHistory();
        doc.write("Version 1");
        history.save(doc);
        doc.write("Version 2");
        history.save(doc);
        doc.write("Version 3");
        System.out.println("Current Content: " + doc.getContent());
        history.undo(doc);
        System.out.println("After undo: " + doc.getContent());
        history.undo(doc);
        System.out.println("After undo: " + doc.getContent());
    }
}
