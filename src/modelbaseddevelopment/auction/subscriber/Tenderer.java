package modelbaseddevelopment.auction.subscriber;

import modelbaseddevelopment.auction.subject.Product;
import modelbaseddevelopment.auction.subject.Subject;

public class Tenderer implements Subscriber{

    // Atribute of the tenderer
    private String name;

    // Constructor of the tenderer
    public Tenderer(String name) {
        this.name = name;
    }
    @Override
    public void update(Subject subject) {
        Product product = (Product) subject;
        System.out.println("[msg to "+ this.name +"]: Se ha actualizado el precio de producto [" + product.getName() + "]: " + product.getPrice());
    }

    // Licitador ofertando por el producto
    public void offer(Product product, double price) {
        product.setPrice(price);
    }
}
