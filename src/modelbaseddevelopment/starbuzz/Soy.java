package modelbaseddevelopment.starbuzz;

public class Soy extends CondimentDecorator {
    Baverage baverage;

    public Soy(Baverage baverage) {
        this.baverage = baverage;
    }

    public String getDescription() {
        return baverage.getDescription() + ", Soy";
    }

    public double cost() {
        return .15 + baverage.cost();
    }
}
