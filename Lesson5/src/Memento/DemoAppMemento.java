package Memento;

public class DemoAppMemento {

	public static void main(String[] args) {

        Document document = new Document(1, "Some Text Document");
        document.setDescription("My First Document");
        System.out.println(document);

        DocumentMemento memento = document.createMemento();

        document.setDescription("ABCABCABCABCABCA");
        document.setTitle("aasdfasdfqwgf");
        System.out.println(document);

        document.restore(memento);
        System.out.println(document);
    }
}

/* РЕЗУЛЬТАТ:

Document id=1, title=Some Text Document, description=My First Document]
Document id=1, title=aasdfasdfqwgf, description=ABCABCABCABCABCA]
Document id=1, title=Some Text Document, description=My First Document]

 */