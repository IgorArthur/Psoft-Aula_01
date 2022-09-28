package model;

public class Product {

    public Product(String name, String provider, double price) {
        this.name = name;
        this.provider = provider;
        this.price = price;
    }

    private String name;
    private String provider;
    private double price;

    public void setName(String newName) {
        this.name = newName;
    }

    public void setProvider(String newProvider) {
        this.provider = newProvider;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public String getName() {
        return this.name;
    }

    public String getProvider() {
        return this.provider;
    }

    public double getPrice() {
        return this.price;
    }
}
