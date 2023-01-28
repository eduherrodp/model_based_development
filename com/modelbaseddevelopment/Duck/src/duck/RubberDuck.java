package duck;

import duck.behavior.FlyBehavior;
import duck.behavior.QuackBehavior;

public class RubberDuck extends Duck {
    // This is a constructor that takes two arguments
    // and assigns them to the instance variables fb and qb
    public RubberDuck(FlyBehavior fb, QuackBehavior qb) {
        super(fb, qb);
    }
    // This is a method that displays the duck
    public void display() {
        System.out.println("I'm a Rubber duck");
    }
}
