package Duck;

// Implementing the class Duck
// showDuck is a method that display, performFly and performQuack and swim methods are called
public class Duck {
    FlyBehavior fb;
    QuackBehavior qb;

    // This is a constructor that takes two arguments
    // and assigns them to the instance variables fb and qb
    public Duck(FlyBehavior fb, QuackBehavior qb) {
        this.fb = fb;
        this.qb = qb;
    }

    // performFly is a method that calls the fly method of the instance variable fb
    public void performFly() {
        fb.fly();
    }
    public void performQuack() {
        qb.quack();
    }
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
    public void display() {
        System.out.println("I'm a real Duck");
    }
    // Function to display the duck
    public void showDuck() {
        display();
        performFly();
        performQuack();
        swim();
    }
}
