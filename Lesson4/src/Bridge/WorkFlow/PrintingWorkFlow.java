package Bridge.WorkFlow;

import Bridge.PrintedMatter.PrintedMatter;

public class PrintingWorkFlow extends WorkFlow {

    public PrintingWorkFlow() {
        super();
    }

    @Override
    public void work (PrintedMatter printedMatter) {
        System.out.print("\tPrinting (печать) ... ");
        // some logic here
        System.out.println("Done");
    }
}
