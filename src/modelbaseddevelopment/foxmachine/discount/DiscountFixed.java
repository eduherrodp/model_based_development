package modelbaseddevelopment.foxmachine.discount;

public class DiscountFixed implements Discount{
    // This is a class that implements the interface Discount
    @Override
    public double discount(double price) {
        // The discount is fixed to 50
        return price - 50;
    }
}
