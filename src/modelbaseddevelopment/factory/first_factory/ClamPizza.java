package modelbaseddevelopment.factory.first_factory;

import modelbaseddevelopment.factory.Pizza;

public class ClamPizza extends Pizza {
    public ClamPizza() {
        name = "Clam Pizza";
        toppings.add("Clams");
        toppings.add("Cheese");
    }
}
