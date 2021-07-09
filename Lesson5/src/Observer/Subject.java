package Observer;

import Observer.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        System.out.println("Новое сообщение: " + message);
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
        System.out.println("Наблюдатель подписан: " + observer.getClass().getSimpleName());
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            System.out.println("Сообщение отправлено ~~> " + observer.getClass().getSimpleName());
            observer.update();
        }
    }
}
