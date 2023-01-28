package duck.behavior;
public class MuteQuack implements QuackBehavior {
    // This is a class that implements the interface QuackBehavior
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
