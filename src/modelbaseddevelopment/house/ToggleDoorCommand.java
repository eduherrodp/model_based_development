package modelbaseddevelopment.house;

class ToggleDoorCommand implements Command {
    private final House house;

    public ToggleDoorCommand(House house) {
        this.house = house;
    }

    @Override
    public void execute() {
        house.setDoorOpen(!house.isDoorOpen());
        System.out.println("Door is now " + (house.isDoorOpen() ? "open" : "closed"));
    }
}
