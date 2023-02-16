package modelbaseddevelopment.factory.second_factory;

import modelbaseddevelopment.factory.Pizza;

public class EdClamPizza extends Pizza {
    public EdClamPizza() {
        name = "Clam Pizza";
        toppings.add("Clams");
        toppings.add("Cheese");
        toppings.add("Ed's Special Clams");
    }
}
