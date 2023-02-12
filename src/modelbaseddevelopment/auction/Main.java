package modelbaseddevelopment.auction;

import modelbaseddevelopment.auction.subject.Product;
import modelbaseddevelopment.auction.subscriber.Tenderer;

public class Main {
    public static void main(String[] args) {
        // Crearemos siete licitadores
        Tenderer tenderer1 = new Tenderer("Eduardo");
        Tenderer tenderer2 = new Tenderer("Juan");
        Tenderer tenderer3 = new Tenderer("Pedro");
        Tenderer tenderer4 = new Tenderer("Sofia");
        Tenderer tenderer5 = new Tenderer("Maria");
        Tenderer tenderer7 = new Tenderer("Alfredo");


        // Eduardo, Juan y Pedro ofertan por el producto 1 el cual es una laptop Lenovo Thinkpad
        // Sofia, Maria, Luis y Alfredo ofertan por el producto 2 el cual es una laptop HP Pavilion

        // Crearemos dos productos
        Product product1 = new Product("Lenovo Thinkpad", "Laptop", 15000, true);
        Product product2 = new Product("HP Pavilion", "Laptop", 20000, true);

        // Mostramos los productos
        System.out.println("\nProducto no. 1: " + product1.getName() + " Precio base: " + product1.getPrice());
        System.out.println("Producto no. 2: " + product2.getName() + " Precio base: " + product2.getPrice() + "\n");

        // Subscribimos a los licitadores a los productos
        product1.registerTenderer(tenderer1);
        product1.registerTenderer(tenderer2);
        product1.registerTenderer(tenderer3);

        // Los licitadores ofertan por los productos y se notifica a los demas licitadores
        tenderer1.offer(product1, 15500);

        // Se les debe notificar a Eduardo, Juan y Pedro que el precio ha cambiado
        // Con la primera puja, Juan se retira del producto 1, se une al producto 2, al igual que Sofía, María y Alfredo

        product1.removeTenderer(tenderer2);

        product2.registerTenderer(tenderer2);
        product2.registerTenderer(tenderer4);
        product2.registerTenderer(tenderer5);
        product2.registerTenderer(tenderer7);

        // Pedro oferta 16000 por el producto 1
        tenderer3.offer(product1, 16000);

        // Alfredo oferta 21000 por el producto 2
        tenderer7.offer(product2, 21000);

        // Los licitadores del producto 2 se retiran y gana Alfredo

        product2.removeTenderer(tenderer2);
        product2.removeTenderer(tenderer4);
        product2.removeTenderer(tenderer5);

        // Se modifica el estado disponible del producto 2 a false
        product2.setAvailable(false);
        System.out.println("Producto no. 2: " + product2.getName() + " Precio base: " + product2.getPrice() + " Disponible: " + product2.isAvailable() + "\n");
    }
}
