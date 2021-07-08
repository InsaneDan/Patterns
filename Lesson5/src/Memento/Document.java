package Memento;

public class Document {
    private long id;
    private String title;
    private String description;

    public Document(long id, String title) {
        super();
        this.id = id;
        this.title = title;
    }

    public DocumentMemento createMemento() {
        return new DocumentMemento(id, title, description);
    }

    public void restore(DocumentMemento mementoDoc) {
        this.id = mementoDoc.getId();
        this.title = mementoDoc.getTitle();
        this.description = mementoDoc.getDescription();
    }

    @Override
    public String toString() {
        return "Document id=" + id + ", title=" + title + ", description=" + description + "]";
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

