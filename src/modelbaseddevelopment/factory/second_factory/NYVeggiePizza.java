package modelbaseddevelopment.factory.second_factory;

import modelbaseddevelopment.factory.Pizza;

public class NYVeggiePizza extends Pizza {
    public NYVeggiePizza() {
        name = "Veggie Pizza";
        toppings.add("Mushrooms");
        toppings.add("Onions");
        toppings.add("Green Peppers");
        //more toppings here
        toppings.add("Sustitute of pepperoni");
    }
}
