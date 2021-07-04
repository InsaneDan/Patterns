package Bridge.WorkFlow;

import Bridge.PrintedMatter.PrintedMatter;

public class DesignWorkFlow extends WorkFlow {

    public DesignWorkFlow() {
        super();
    }

    @Override
    public void work (PrintedMatter printedMatter) {
        System.out.print("\tDesign (верстка и дизайн) ... ");
        // some logic here
        System.out.println("Done");
    }
}
