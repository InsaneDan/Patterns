package State;

public class DemoAppState {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.walk();
        robot.cook();
        robot.walk();
        robot.off();

        robot.walk();
        robot.off();
        robot.cook();

    }
}

/* РЕЗУЛЬТАТ:

Walking...
In standby state...
Cooking...
In standby state...
Walking...
In standby state...
Robot is switched off
Walking...
In standby state...
Robot is switched off
Cannot cook at Off state.

 */