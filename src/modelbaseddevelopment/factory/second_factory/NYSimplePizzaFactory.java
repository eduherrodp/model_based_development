package modelbaseddevelopment.factory.second_factory;

import modelbaseddevelopment.factory.Pizza;

public class NYSimplePizzaFactory extends Pizza {
    public Pizza createPizza(String type) {
        Pizza pizza;
        switch (type) {
            case "cheese" -> pizza = new NYCheesePizza();
            case "pepperoni" -> pizza = new NYPepperoniPizza();
            case "clam" -> pizza = new NY();
            case "veggie" -> pizza = new NYVeggiePizza();
            default -> {
                return null;
            }
        }
        return pizza;
    }
}