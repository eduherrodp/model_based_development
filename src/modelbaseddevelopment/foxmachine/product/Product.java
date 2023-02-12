package modelbaseddevelopment.foxmachine;

import modelbaseddevelopment.foxmachine.discount.Discount;

public class Product {
    Discount discount;
    // Attributes of the class Product
    private final String name;
    private final double price;
    private final String description;
    private final double discountPrice;

    // Constructor of the class Product
    public Product(String name, double price, String description, Discount discount) {
        this.name = name;
        this.description = description;
        this.discount = discount;
        this.price = price;
        this.discountPrice = discount.discount(price);
    }

    // Getters and Setters of the class Product
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

}
