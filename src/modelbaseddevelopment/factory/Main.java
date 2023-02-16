package modelbaseddevelopment.factory;

import modelbaseddevelopment.factory.first_factory.*;
import modelbaseddevelopment.factory.second_factory.*;

// This code is not of my own creation.
public class Main {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        Pizza pizza1 = store.orderPizza("cheese");
        System.out.println(pizza1);

        // New pizza store with new factory "NYPizzaStore"
        NYSimplePizzaFactory nyFactory = new NYSimplePizzaFactory();
        NYPizzaStore edStore = new NYPizzaStore(nyFactory);
        Pizza pizza2 = edStore.orderPizza("pepperoni");
        System.out.println(pizza2);
    }
}
