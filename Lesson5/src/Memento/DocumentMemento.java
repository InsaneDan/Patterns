package Memento;

public final class DocumentMemento {
    private final long id;
    private final String title;
    private final String description;

    public DocumentMemento(long id, String title, String description) {
        super();
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}

