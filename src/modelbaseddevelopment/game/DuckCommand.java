package modelbaseddevelopment.game;

public class DuckCommand implements Command {
    private final Player player;

    public DuckCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.duck();
    }
}
