package Bridge.WorkFlow;

import Bridge.PrintedMatter.PrintedMatter;

public class WritingWorkFlow extends WorkFlow {

    public WritingWorkFlow() {
        super();
    }

    @Override
    public void work (PrintedMatter printedMatter) {
        System.out.print("\tWriting (написать текст - книга или статья) ... ");
        // some logic here
        System.out.println("Done");
    }
}
