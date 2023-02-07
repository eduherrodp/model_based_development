package modelbaseddevelopment.starbuzz;

public class Whip extends CondimentDecorator {
    Baverage baverage;

    public Whip(Baverage baverage) {
        this.baverage = baverage;
    }

    public String getDescription() {
        return baverage.getDescription() + ", Whip";
    }

    public double cost() {
        return .10 + baverage.cost();
    }
}
