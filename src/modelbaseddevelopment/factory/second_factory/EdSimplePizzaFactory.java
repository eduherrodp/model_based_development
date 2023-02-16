package modelbaseddevelopment.factory.second_factory;

import modelbaseddevelopment.factory.Pizza;

public class EdSimplePizzaFactory extends Pizza {
    public Pizza createPizza(String type) {
        Pizza pizza;
        switch (type) {
            case "cheese" -> pizza = new EdCheesePizza();
            case "pepperoni" -> pizza = new EdPepperoniPizza();
            case "clam" -> pizza = new EdClamPizza();
            case "veggie" -> pizza = new EdVeggiePizza();
            default -> {
                return null;
            }
        }
        return pizza;
    }
}