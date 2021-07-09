package Observer.observers;

import Observer.Subject;

public class ThirdObserver extends Observer {

    Subject subject;

    public ThirdObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("==> " + this.getClass().getSimpleName() + " принял сообщение: " + subject.getMessage());
    }

}
