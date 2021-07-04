package Bridge.PrintedMatter;

public class Magazine extends PrintedMatter {

    @Override
    public void manufacture() {
        System.out.println("Producing Magazine ~~>");
        workFlows.stream().forEach(workFlow -> workFlow.work(this));
        System.out.println("~~> completed");
        System.out.println();
    }
}
