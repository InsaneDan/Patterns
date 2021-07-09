package Observer.observers;

import Observer.Subject;

public abstract class Observer {

    Subject subject;

    public abstract void update();

}
