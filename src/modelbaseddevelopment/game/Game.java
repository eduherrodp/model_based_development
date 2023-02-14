package modelbaseddevelopment.game;

public class Game {
    public static void main(String[] args) {
        // create the receiver
        Player player = new Player();

        // create the commands
        JumpCommand jump = new JumpCommand(player);
        ShootCommand shoot = new ShootCommand(player);
        RunCommand run = new RunCommand(player);
        DuckCommand duck = new DuckCommand(player);

        // create the invoker and set the commands
        Controller controller = new Controller();
        controller.setCommand("A", jump);
        controller.setCommand("B", shoot);
        controller.setCommand("X", run);
        controller.setCommand("Y", duck);

        // simulate button presses
        controller.pressButton("A");
        controller.pressButton("X");
        controller.pressButton("B");
        controller.pressButton("Y");
        controller.pressButton("Z");

    }
}
