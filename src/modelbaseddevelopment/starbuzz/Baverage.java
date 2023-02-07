package modelbaseddevelopment.starbuzz;

public abstract class Baverage {
    String description = "Unknown Baverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
