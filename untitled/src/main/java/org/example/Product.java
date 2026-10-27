package org.example;

public class Product implements Comparable<Product>{
    private String name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name + " - R$" + String.format("%.2f", price);
    }

    @Override
    public int compareTo(Product product) {
        return this.name.toUpperCase().compareTo(product.getName().toUpperCase());
    }
}
