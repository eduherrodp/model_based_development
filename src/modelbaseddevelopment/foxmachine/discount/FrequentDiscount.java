package modelbaseddevelopment.foxmachine.discount;

public class FrequentDiscount implements Discount{
    // As a frequent customer you get a discount of 15 percent on the price
    @Override
    public double discount(double price) {
        return price - (price * 0.15);
    }
}
