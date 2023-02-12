package modelbaseddevelopment.window;

public class WindowImpl implements Window {
    // Attribute description
    // This description is a simple window, without any decoration
    private String description = "Simple window";

    public String getDescription() {
        return description;
    }

    public void display() {
        System.out.println("Displaying " + description);
    }
}
