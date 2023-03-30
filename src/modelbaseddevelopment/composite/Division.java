package modelbaseddevelopment.composite;

public class Division implements Arithmetic {
    private final double x;
    private final double y;

    public Division(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double compute() {
        return x / y;
    }
}
