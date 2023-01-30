// Program: Duck
// Programmer: José Eduardo Hernández Rodríguez
// Date: 18/01/2023
// Description: This program is a simulation of a duck that can fly and quack
package modelbaseddevelopment.ducksimulator;

import modelbaseddevelopment.ducksimulator.duck.*;
import modelbaseddevelopment.ducksimulator.flybehavior.*;
import modelbaseddevelopment.ducksimulator.quackbehavior.*;


// Main class that contains the main method, performs the duck simulation

public class Main  {
    // This is the main method

    public static void main(String[] args) {
        // MallardDuck class
        Duck mallard = new MallardDuck(new FlyWithWings(), new Quack());
        mallard.showDuck();

        // RedheadDuck class
        Duck redhead = new RedheadDuck(new FlyWithWings(), new Quack());
        redhead.showDuck();

        // RubberDuck class
        Duck rubber = new RubberDuck(new FlyNoWay(), new Squeak());
        rubber.showDuck();

        // DecoyDuck class
        Duck decoy = new DecoyDuck(new FlyNoWay(), new MuteQuack());
        decoy.showDuck();

        // BallonDuck class
        Duck ballon = new BallonDuck(new FlyWithBallon(), new Squeak());
        ballon.showDuck();

    }
}