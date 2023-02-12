package modelbaseddevelopment.window;

public class WindowDecorator implements Window{
    // windowToBeDecorated will be modified by subclasses of WindowDecorator so, we need to make it protected
    protected Window windowToBeDecorated;

    public WindowDecorator(Window windowToBeDecorated) {
        this.windowToBeDecorated = windowToBeDecorated;
    }

    public void display() {
        windowToBeDecorated.display();
    }
}
