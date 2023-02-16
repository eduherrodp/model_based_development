package modelbaseddevelopment.factory.second_factory;

import modelbaseddevelopment.factory.Pizza;

public class NYCheesePizza extends Pizza {
    public NYCheesePizza() {
        String name = "Cheese Pizza";
        toppings.add("Mozzarella");
        toppings.add("Parmesan");
        toppings.add("Ed's Special Cheese");
    }
}
