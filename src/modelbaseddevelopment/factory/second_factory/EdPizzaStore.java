package modelbaseddevelopment.factory.second_factory;

import modelbaseddevelopment.factory.Pizza;
import modelbaseddevelopment.factory.first_factory.SimplePizzaFactory;

public class EdPizzaStore {
    EdSimplePizzaFactory factory;
    public EdPizzaStore(EdSimplePizzaFactory factory) {
        this.factory = factory;
    }
    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
