package modelbaseddevelopment.template;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------------");
        PaqueteDecoracion paqueteDecoracion = new Arenisca();
        paqueteDecoracion.elaboracion();
        System.out.println("\n-------------------------------");
        paqueteDecoracion = new Granito();
        paqueteDecoracion.elaboracion();
        System.out.println("\n-------------------------------");
        paqueteDecoracion = new Marmol();
        paqueteDecoracion.elaboracion();
    }
}
