package modelbaseddevelopment.window;

public class WindowDecorator implements Window{
    protected Window windowToBeDecorated;

    public WindowDecorator(Window windowToBeDecorated) {
        this.windowToBeDecorated = windowToBeDecorated;
    }

    public void display() {
        windowToBeDecorated.display();
    }
}
