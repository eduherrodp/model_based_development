package modelbaseddevelopment.factory.first_factory;

import modelbaseddevelopment.factory.Pizza;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        name = "Pepperoni Pizza";
        toppings.add("Pepperoni");
        toppings.add("Onion");
    }
}
