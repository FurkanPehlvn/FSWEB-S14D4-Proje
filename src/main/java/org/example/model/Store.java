package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];

        products[0] = new Chocolate("Dark Chocolate", 2.99, "Rich dark chocolate with 70% cocoa.");
        products[1] = new Coke("Coca-Cola", 1.50, "Refreshing beverage with a unique taste.");
        products[2] = new Bread("Whole Wheat Bread", 3.50, "Healthy whole wheat bread.");

        Store store = new Store();
        store.listProducts(products);

    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
            System.out.println();
        }

    }
}