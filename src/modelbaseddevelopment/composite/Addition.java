package modelbaseddevelopment.composite;

public class Addition implements Arithmetic {
    private final double x;
    private final double y;

    public Addition(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double compute() {
        return x + y;
    }
}
