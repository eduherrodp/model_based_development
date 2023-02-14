package modelbaseddevelopment.game;

public class ShootCommand implements Command {
    private final Player player;

    public ShootCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.shoot();
    }
}
