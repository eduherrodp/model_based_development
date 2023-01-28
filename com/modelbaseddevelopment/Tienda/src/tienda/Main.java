package tienda;

// Función principal
public class Main {
    public static void main(String[] args) {
        // Implementación de la tienda
        Tienda tienda = new Tienda("Electrodomésticos S.A.");
        // Implementación de los productos
        ProductoImpl producto1 = new ProductoImpl("Televisor", "Televisor de 50 pulgadas", 1000, true, tienda);
        ProductoImpl producto2 = new ProductoImpl("Nevera", "Nevera de 200 litros", 500, true, tienda);

        // Implementación de los clientes
        Cliente cliente1 = new Cliente("Eduardo");
        Cliente cliente2 = new Cliente("Atenas");

        // Suscripción de los clientes
        // Eduardo se suscribe a los cambios de precio del televisor
        tienda.suscribir(cliente1, producto1);
        // Atenas se suscribe a los cambios de precio de la nevera y del televisor
        tienda.suscribir(cliente2, producto1);
        tienda.suscribir(cliente2, producto2);

        // Cambio de precio del televisor
        producto1.setPrecio(900);
        // Cambio de precio de la nevera
        producto2.setPrecio(450);

        // Cambio de disponibilidad del televisor
        producto1.setDisponible(false);
    }
}