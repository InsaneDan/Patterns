package State.states;

import State.Robot;
import State.states.RoboticState;

public class RoboticCook implements RoboticState {

    private final Robot robot;

    public RoboticCook(Robot robot){
        this.robot = robot;
    }

    @Override
    public void walk() {
        System.out.println("Walking...");
        robot.setRoboticState(robot.getRoboticOn());
    }

    @Override
    public void cook() {
        System.out.println("Cooking...");
    }

    @Override
    public void off() {
        System.out.println("Cannot switched off while cooking...");
    }
}
