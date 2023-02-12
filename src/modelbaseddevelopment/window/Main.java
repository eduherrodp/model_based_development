package modelbaseddevelopment.window;

public class Main {
    public static void main(String[] args) {

        System.out.println("Creamos una nueva ventana: ");
        Window window = new WindowImpl();
        window.display();

        System.out.println("\nLe agregamos un border y un vertical scroll: ");
        window = new BorderWindow(window);
        window = new VerticalScroll(window);
        window.display();

        System.out.println("\nLe agregamos un horizontal scroll: ");
        window = new HorizontalScroll(window);
        window.display();
    }
}
