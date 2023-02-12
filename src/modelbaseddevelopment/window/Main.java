package modelbaseddevelopment.window;

public class Main {
    public static void main(String[] args) {
        Window window = new BorderWindow(new HorizontalScroll(new VerticalScroll(new WindowImpl())));
        window.display();
    }
}
