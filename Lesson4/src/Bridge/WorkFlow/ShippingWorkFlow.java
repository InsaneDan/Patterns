package Bridge.WorkFlow;

import Bridge.PrintedMatter.PrintedMatter;

public class ShippingWorkFlow extends WorkFlow {

    public ShippingWorkFlow() {
        super();
    }

    @Override
    public void work (PrintedMatter printedMatter) {
        System.out.print("\tShipping (отгрузка на склад) ... ");
        // some logic here
        System.out.println("Done");
    }
}
