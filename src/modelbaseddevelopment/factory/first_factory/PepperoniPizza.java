package modelbaseddevelopment.factory.first_factory;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        name = "Pepperoni Pizza";
        toppings.add("Pepperoni");
        toppings.add("Onion");
    }
}
