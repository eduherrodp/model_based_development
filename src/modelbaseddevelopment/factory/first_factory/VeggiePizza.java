package modelbaseddevelopment.factory.first_factory;

import modelbaseddevelopment.factory.Pizza;

public class VeggiePizza extends Pizza {
    public VeggiePizza() {
        name = "Veggie Pizza";
        toppings.add("Mushrooms");
        toppings.add("Onions");
        toppings.add("Green Peppers");
    }
}
