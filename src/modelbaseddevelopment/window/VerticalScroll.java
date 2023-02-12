package modelbaseddevelopment.window;

public class VerticalScroll extends WindowDecorator {
    public VerticalScroll(Window windowToBeDecorated) {
        super(windowToBeDecorated);
    }

    public void display() {
        super.display();
        System.out.println("Vertical scroll bar");
    }
}
