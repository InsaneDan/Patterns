package Bridge.PrintedMatter;

public class Book extends PrintedMatter {

    @Override
    public void manufacture() {
        System.out.println("Producing Book ~~>");
        workFlows.stream().forEach(workFlow -> workFlow.work(this));
        System.out.println("~~> completed");
        System.out.println();
    }
}
