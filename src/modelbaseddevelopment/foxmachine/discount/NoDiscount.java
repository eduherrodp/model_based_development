package modelbaseddevelopment.foxmachine.discount;

public class NoDiscount implements Discount{
    // No discount is applied
    @Override
    public double discount(double price) {
        // just return the price
        return price;
    }
}
