package modelbaseddevelopment.factory.first_factory;

public class CheesePizza extends Pizza{
    public CheesePizza() {
        name = "Cheese Pizza";
        toppings.add("Mozzarella");
        toppings.add("Parmesan");
    }
}
