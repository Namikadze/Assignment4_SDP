package memento;
public class Document {
    private String content;
    public void write(String text) {
        content = text;
    }
    public String getContent() {
        return content;
    }
    public Memento save() {
        return new Memento(content);
    }
    public void restore(Memento memento) {
        content = memento.getContent();
    }
}
