package modelbaseddevelopment.starbuzz;

public class Mocha extends CondimentDecorator {
    Baverage baverage;

    public Mocha(Baverage baverage) {
        this.baverage = baverage;
    }

    public String getDescription() {
        return baverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return .20 + baverage.cost();
    }
}
