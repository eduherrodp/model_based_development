package modelbaseddevelopment.house;

class MenuItem {
    private final String name;
    private final Command command;

    public MenuItem(String name, Command command) {
        this.name = name;
        this.command = command;
    }

    public void execute() {
        command.execute();
    }

    public String getName() {
        return name;
    }
}
