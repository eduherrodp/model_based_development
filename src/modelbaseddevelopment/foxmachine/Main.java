package modelbaseddevelopment.foxmachine;

import modelbaseddevelopment.foxmachine.discount.*;

public class Main {

    public static void main(String[] args) {
        // Create a new product without discount
        Product product = new Product("HP SmartTank", 5000, "SmartThank, the efficiency is perfect", new NoDiscount());

        // Create the same product but now a frequent customer gets a discount of 15 percent
        Product product2 = new Product("HP SmartTank", 5000, "SmartThank, the efficiency is perfect", new FrequentDiscount());

        // Create a new product with a discount of 5 percent
        Product product3 = new Product("Cannon 1500G", 17900, "Printer for business purposes", new DiscountFive());

        // Create the same product with fixed discount
        Product product4 = new Product("Cannon 1500G", 17900, "Printer for business purposes", new DiscountFixed());

        // Show the products without discount and with discount
        System.out.println("\nProduct 1: (no discount) \n\t" + product.getName() + "\n\tDescription: " + product.getDescription() + " \n\tOriginal price: " + product.getPrice() + " \n\tDiscount price: " + product.getDiscountPrice());

        System.out.println("\nProduct 2: (frequent customer) \n\t" + product2.getName() + "\n\tDescription: " + product2.getDescription() + " \n\tOriginal price: " + product2.getPrice() + " \n\tDiscount price: " + product2.getDiscountPrice());

        System.out.println("\nProduct 3: (discount five percent) \n\t" + product3.getName() + "\n\tDescription: " + product3.getDescription() + " \n\tOriginal price: " + product3.getPrice() + " \n\tDiscount price: " + product3.getDiscountPrice());

        System.out.println("\nProduct 4: (discount fixed for 50) \n\t" + product4.getName() + "\n\tDescription: " + product4.getDescription() + " \n\tOriginal price: " + product4.getPrice() + " \n\tDiscount price: " + product4.getDiscountPrice());
    }
}
