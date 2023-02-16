package modelbaseddevelopment.factory.first_factory;

import modelbaseddevelopment.factory.Pizza;

public class SimplePizzaFactory extends Pizza {
    public Pizza createPizza(String type) {
        Pizza pizza;
        switch (type) {
            case "cheese" -> pizza = new CheesePizza();
            case "pepperoni" -> pizza = new PepperoniPizza();
            case "clam" -> pizza = new ClamPizza();
            case "veggie" -> pizza = new VeggiePizza();
            default -> {
                return null;
            }
        }
        return pizza;
    }
}