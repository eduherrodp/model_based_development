package modelbaseddevelopment.composite;

public class Subtraction implements Arithmetic {
    private final double x;
    private final double y;

    public Subtraction(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double compute() {
        return x - y;
    }
}
