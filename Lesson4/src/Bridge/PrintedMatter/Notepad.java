package Bridge.PrintedMatter;

public class Notepad extends PrintedMatter {

    @Override
    public void manufacture() {
        System.out.println("Producing Notepad ~~>");
        workFlows.stream().forEach(workFlow -> workFlow.work(this));
        System.out.println("~~> completed");
        System.out.println();
    }
}
