package Bridge.WorkFlow;

import Bridge.PrintedMatter.PrintedMatter;

public class BindingWorkFlow extends WorkFlow {

    public BindingWorkFlow() {
        super();
    }

    @Override
    public void work (PrintedMatter printedMatter) {
        System.out.print("\tBinding (переплет) ... ");
        // some logic here
        System.out.println("Done");
    }
}
