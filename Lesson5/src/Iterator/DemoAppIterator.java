package Iterator;

import Iterator.collection.Element;
import Iterator.collection.Iterator;
import Iterator.collection.StringCollection;

public class DemoAppIterator {

    public static void main(String[] args) {
        StringCollection stringCollection = new StringCollection();
        Iterator iterator = stringCollection.createIterator();

        while (iterator.hasNext()) {
            Element element = (Element) iterator.next();
            System.out.println(element.getElement());
        }

    }

}

/* РЕЗУЛЬТАТ:

Element 1
Element 2
Element 3
Element 4
Element 5
Element 6
Element 7
Element 8
Element 9
Element 10

 */