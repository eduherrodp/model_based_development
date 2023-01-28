package duck.behavior;

public class FlyNoWay implements FlyBehavior {
    // This is a class that implements the interface FlyBehavior
    public void fly() {
        System.out.println("I can't fly");
    }
}

