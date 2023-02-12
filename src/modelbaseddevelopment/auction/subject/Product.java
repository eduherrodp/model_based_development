package modelbaseddevelopment.auction.subject;

import modelbaseddevelopment.auction.subscriber.Tenderer;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
    // Attributes of the product
    private String name;
    private String description;
    private double price;
    private boolean available;
    // List of tenderers
    private List<Tenderer> tenderers = new ArrayList<Tenderer>();

    // Constructor of the product
    public Product(String name, String description, double price, boolean available) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.available = available;
    }

    // Override the registerTenderer method
    @Override
    public void registerTenderer(Tenderer t) {
        tenderers.add(t);
    }

    @Override
    public void removeTenderer(Tenderer t) {
        tenderers.remove(t);
    }

    @Override
    public void notifyTenderers() {
        for (Tenderer tenderer : tenderers) {
            tenderer.update(this);
        }
    }

    // Getters and setters
    public double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
        notifyTenderers();
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public List<Tenderer> getTenderers() {
        return tenderers;
    }
}