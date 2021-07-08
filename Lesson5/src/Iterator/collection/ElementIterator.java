package Iterator.collection;

public class ElementIterator implements Iterator {

    Element[] elementsList;
    int pos = 0;

    public  ElementIterator (Element[] elementsList) {
        this.elementsList = elementsList;
    }

    public Object next() {
        Element element =  elementsList[pos];
        pos += 1;
        return element;
    }

    public boolean hasNext() {
        return (pos < elementsList.length);
    }
}
