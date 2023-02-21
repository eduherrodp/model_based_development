package modelbaseddevelopment.house;

public class ToggleLightsCommand implements Command {
    private final House house;

    public ToggleLightsCommand(House house) {
        this.house = house;
    }

    @Override
    public void execute() {
        house.setLightsOn(!house.areLightsOn());
        System.out.println("Lights are now " + (house.areLightsOn() ? "on" : "off"));
    }
}
