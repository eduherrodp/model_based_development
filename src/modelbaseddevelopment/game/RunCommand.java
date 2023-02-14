package modelbaseddevelopment.game;

public class RunCommand implements Command {
    private final Player player;

    public RunCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.run();
    }
}
