package modelbaseddevelopment.house;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        House house = new House();

        // Create commands
        Command toggleLightsCommand = new ToggleLightsCommand(house);
        Command toggleDoorCommand = new ToggleDoorCommand(house);

        // Create menu options
        MenuItem toggleLightsMenuItem = new MenuItem("Toggle Lights", toggleLightsCommand);
        MenuItem toggleDoorMenuItem = new MenuItem("Toggle Door", toggleDoorCommand);

        // Create menu
        Menu menu = new Menu();
        menu.addMenuItem(toggleLightsMenuItem);
        menu.addMenuItem(toggleDoorMenuItem);

        // Create scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Main loop
        while (true) {
            // Print menu and get user selection
            menu.print();
            int selection = scanner.nextInt();

            // Execute command based on user selection
            menu.select(selection).execute();
        }
    }
}
