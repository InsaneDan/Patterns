package Bridge.PrintedMatter;

public class Poster extends PrintedMatter {

    @Override
    public void manufacture() {
        System.out.println("Producing Poster ~~>");
        workFlows.stream().forEach(workFlow -> workFlow.work(this));
        System.out.println("~~> completed");
        System.out.println();
    }
}
