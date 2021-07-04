package Bridge;

import Bridge.PrintedMatter.*;
import Bridge.WorkFlow.*;

public class DemoAppBridge {
    public static void main(String[] args) {

        PrintedMatter poster = new Poster();
        poster.addWorkFlow(new DesignWorkFlow());
        poster.addWorkFlow(new PrintingWorkFlow());
        poster.addWorkFlow(new ShippingWorkFlow());
        poster.manufacture();

        PrintedMatter notepad = new Notepad();
        notepad.addWorkFlow(new DesignWorkFlow());
        notepad.addWorkFlow(new PrintingWorkFlow());
        notepad.addWorkFlow(new BindingWorkFlow());
        notepad.addWorkFlow(new ShippingWorkFlow());
        notepad.manufacture();

        PrintedMatter book = new Book();
        book.addWorkFlow(new WritingWorkFlow());
        book.addWorkFlow(new CopyeditingWorkFlow());
        book.addWorkFlow(new PrintingWorkFlow());
        book.addWorkFlow(new BindingWorkFlow());
        book.addWorkFlow(new ShippingWorkFlow());
        book.manufacture();

        PrintedMatter magazine = new Magazine();
        magazine.addWorkFlow(new WritingWorkFlow()); // статья №1 в журнале
        magazine.addWorkFlow(new WritingWorkFlow()); // статья №2 в журнале
        magazine.addWorkFlow(new WritingWorkFlow()); // статья №3 в журнале
        magazine.addWorkFlow(new CopyeditingWorkFlow());
        magazine.addWorkFlow(new PrintingWorkFlow());
        magazine.addWorkFlow(new BindingWorkFlow());
        magazine.addWorkFlow(new ShippingWorkFlow());
        magazine.manufacture();

    }
}

/* РЕЗУЛЬТАТ (консоль):

Producing Poster ~~>
	Design (верстка и дизайн) ... Done
	Printing (печать) ... Done
	Shipping (отгрузка на склад) ... Done
~~> completed

Producing Notepad ~~>
	Design (верстка и дизайн) ... Done
	Printing (печать) ... Done
	Binding (переплет) ... Done
	Shipping (отгрузка на склад) ... Done
~~> completed

Producing Book ~~>
	Writing (написать текст - книга или статья) ... Done
	Copyediting (редактирование) ... Done
	Printing (печать) ... Done
	Binding (переплет) ... Done
	Shipping (отгрузка на склад) ... Done
~~> completed

Producing Magazine ~~>
	Writing (написать текст - книга или статья) ... Done
	Writing (написать текст - книга или статья) ... Done
	Writing (написать текст - книга или статья) ... Done
	Copyediting (редактирование) ... Done
	Printing (печать) ... Done
	Binding (переплет) ... Done
	Shipping (отгрузка на склад) ... Done
~~> completed
*/