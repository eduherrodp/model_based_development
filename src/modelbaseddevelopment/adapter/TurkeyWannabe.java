package modelbaseddevelopment.adapter;

public class TurkeyWannabe implements Duck {
    @Override
    public void quack() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
