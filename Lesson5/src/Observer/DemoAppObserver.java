package Observer;

import Observer.observers.FirstObserver;
import Observer.observers.SecondObserver;
import Observer.observers.ThirdObserver;

public class DemoAppObserver {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new FirstObserver(subject);
        new SecondObserver(subject);
        new ThirdObserver(subject);

        System.out.println("----------------------------------------");
        String news = "Сообщение №1";
        subject.setMessage(news);
        System.out.println("----------------------------------------");
        news = "Сообщение №2";
        subject.setMessage(news);
    }
}

/* РЕЗУЛЬТАТ:

Наблюдатель подписан: FirstObserver
Наблюдатель подписан: SecondObserver
Наблюдатель подписан: ThirdObserver
----------------------------------------
Новое сообщение: Сообщение №1
Сообщение отправлено ~~> FirstObserver
==> FirstObserver принял сообщение: Сообщение №1
Сообщение отправлено ~~> SecondObserver
==> SecondObserver принял сообщение: Сообщение №1
Сообщение отправлено ~~> ThirdObserver
==> ThirdObserver принял сообщение: Сообщение №1
----------------------------------------
Новое сообщение: Сообщение №2
Сообщение отправлено ~~> FirstObserver
==> FirstObserver принял сообщение: Сообщение №2
Сообщение отправлено ~~> SecondObserver
==> SecondObserver принял сообщение: Сообщение №2
Сообщение отправлено ~~> ThirdObserver
==> ThirdObserver принял сообщение: Сообщение №2

 */