package org.example.model;

public class Bread extends ProductForSale {
    private boolean toasted;

    public Bread(String type, double price, String description) {
        super(type, price, description);

    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
    }
}
