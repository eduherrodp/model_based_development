package modelbaseddevelopment.factory;

import modelbaseddevelopment.factory.first_factory.*;

// This code is not of my own creation.
public class Main {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        Pizza pizza1 = store.orderPizza("cheese");
        System.out.println(pizza1);
    }
}
