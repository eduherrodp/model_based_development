package modelbaseddevelopment.foxmachine.discount;

public class DiscountFive implements Discount{
    // This is a class that implements the interface Discount, the discount is subtracted from the price
    @Override
    public double discount(double price) {
        // subtract 5 percent from the price
        return price - (price * 0.05);
    }
}
