package modelbaseddevelopment.factory.second_factory;

import modelbaseddevelopment.factory.Pizza;

public class NY extends Pizza {
    public NY() {
        name = "Clam Pizza";
        toppings.add("Clams");
        toppings.add("Cheese");
        toppings.add("Ed's Special Clams");
    }
}
