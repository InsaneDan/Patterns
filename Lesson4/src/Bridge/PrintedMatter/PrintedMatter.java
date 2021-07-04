package Bridge.PrintedMatter;

import Bridge.WorkFlow.WorkFlow;

import java.util.ArrayList;
import java.util.List;

public abstract class PrintedMatter {

    // последовательность событий производственного процесса
    List<WorkFlow> workFlows = new ArrayList<>();

    public PrintedMatter() {
        super();
    }

    public boolean addWorkFlow(WorkFlow workFlow) {
        return workFlows.add(workFlow);
    }

    public abstract void manufacture();

}
