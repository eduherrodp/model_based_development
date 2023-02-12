package modelbaseddevelopment.window;

public class BorderWindow extends WindowDecorator {
    public BorderWindow(Window windowToBeDecorated) {
        super(windowToBeDecorated);
    }

    public void display() {
        super.display();
        System.out.println("Border window");
    }
}
