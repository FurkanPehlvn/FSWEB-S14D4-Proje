package org.example.model;

public class Coke extends ProductForSale {

    private boolean sugarFree;
    public Coke(String type, double price, String description) {
        super(type, price, description);

    }

    public boolean isSugarFree() {
        return sugarFree;
    }

    public void setSugarFree(boolean sugarFree) {
        this.sugarFree = sugarFree;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
    }

}
