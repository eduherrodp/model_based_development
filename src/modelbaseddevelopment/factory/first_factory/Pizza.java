package modelbaseddevelopment.factory.first_factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    List<String> toppings = new ArrayList<>();
    public void prepare() {
        System.out.println("... ");
        System.out.println("Preparing " + name);
    }
    public void bake() {
        System.out.println("... ");
        System.out.println("Baking " + name);
    }
    public void cut() {
        System.out.println("... ");
        System.out.println("Cutting " + name);
    }
    public void box() {
        System.out.println("... ");
        System.out.println("Boxing " + name);
        System.out.println("... ");
    }
    public String toString() {
        StringBuilder display = new StringBuilder();
        System.out.println("Pizza Toppings: ");
        for (String topping : toppings) {
            display.append(topping).append("\n");
        }
        return display.toString();
    }
}
