package modelbaseddevelopment.factory.second_factory;

import modelbaseddevelopment.factory.Pizza;

public class EdPepperoniPizza extends Pizza {
    public EdPepperoniPizza() {
        name = "Pepperoni Pizza";
        toppings.add("Pepperoni");
        toppings.add("Onion");
        toppings.add("Ed's Special Pepperoni");
        toppings.add("Parmesan");
    }
}
