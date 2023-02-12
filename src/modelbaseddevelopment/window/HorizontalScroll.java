package modelbaseddevelopment.window;

public class HorizontalScroll implements Window {

    private Window windowToBeDecorated; // the Window being decorated
    public HorizontalScroll(Window windowToBeDecorated) {
        this.windowToBeDecorated = windowToBeDecorated;
    }

    public void display() {
        windowToBeDecorated.display();
        System.out.println("Horizontal Scroll");
    }
}
