package Bridge.WorkFlow;

import Bridge.PrintedMatter.PrintedMatter;

public class CopyeditingWorkFlow extends WorkFlow {

    public CopyeditingWorkFlow() {
        super();
    }

    @Override
    public void work (PrintedMatter printedMatter) {
        System.out.print("\tCopyediting (редактирование) ... ");
        // some logic here
        System.out.println("Done");
    }
}
