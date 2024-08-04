package org.example.model;

public class Chocolate extends ProductForSale {

    private String taste;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);

    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
    }
}
