// Program: Duck
// Programmer: José Eduardo Hernández Rodríguez
// Date: 18/01/2023
// Description: This program is a simulation of a duck that can fly and quack

package Duck;

// Main class that contains the main method, performs the duck simulation
public class Main {
    // This is the main method
    public static void main(String[] args) {
        // Creating an object of MallardDuck class
        // and passing the FlyWithWings and Quack objects as arguments
        Duck mallard = new MallardDuck(new FlyWithWings(), new Quack());
        // Calling the showDuck method
        mallard.showDuck();
        // Creating an object of RedheadDuck class
        // and passing the FlyWithWings and Quack objects as arguments
        Duck redhead = new RedheadDuck(new FlyWithWings(), new Quack());
        // Calling the showDuck method
        redhead.showDuck();
        // Creating an object of RubberDuck class
        // and passing the FlyNoWay and Squeak objects as arguments
        Duck rubber = new RubberDuck(new FlyNoWay(), new Squeak());
        // Calling the showDuck method
        rubber.showDuck();
        // Creating an object of DecoyDuck class
        // and passing the FlyNoWay and MuteQuack objects as arguments
        Duck decoy = new DecoyDuck(new FlyNoWay(), new MuteQuack());

        // Calling the showDuck method
        decoy.showDuck();
    }
}