package modelbaseddevelopment.house;

import java.util.ArrayList;
import java.util.List;

class Menu {
    private final List<MenuItem> menuItems = new ArrayList<>();

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public void print() {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println((i + 1) + ". " + menuItems.get(i).getName());
        }
        System.out.print("Selection: ");
    }

    public MenuItem select(int selection) {
        return menuItems.get(selection - 1);
    }
}