package Iterator.collection;

public class StringCollection implements Collection {

    int itemsCounter = 0;
    Element[] elementsList;

    public StringCollection() {
        elementsList = new Element[10];
        for (int i = 1; i < 11; i++) {
            addItem("Element " + i);
        }
    }

    public void addItem(String str) {
        elementsList[itemsCounter] = new Element(str);
        itemsCounter++;
    }

    public Iterator createIterator() {
        return new ElementIterator(elementsList);
    }
}
