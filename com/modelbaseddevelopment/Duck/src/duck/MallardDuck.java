package duck;

import duck.behavior.FlyBehavior;
import duck.behavior.QuackBehavior;

// This is a subclass from Duck class
// This class is used to implement the MallardDuck and contains the display method
public class MallardDuck extends Duck {
    // This is a constructor that takes two arguments
    // and assigns them to the instance variables fb and qb
    public MallardDuck(FlyBehavior fb, QuackBehavior qb) {
        super(fb, qb);
    }
    // This is a method that displays the duck
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}