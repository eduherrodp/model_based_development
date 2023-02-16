package modelbaseddevelopment.factory.second_factory;

import modelbaseddevelopment.factory.Pizza;

public class NYPepperoniPizza extends Pizza {
    public NYPepperoniPizza() {
        name = "Pepperoni Pizza";
        toppings.add("Pepperoni");
        toppings.add("Onion");
        toppings.add("Ed's Special Pepperoni");
        toppings.add("Parmesan");
    }
}
