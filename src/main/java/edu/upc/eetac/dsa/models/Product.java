package edu.upc.eetac.dsa.models;

import java.util.Objects;

public class Product {
    String productID;
    String productName;
    double price;
    int numSales;
    public Product (String productID, String productName, double price, int numSales){
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.numSales = numSales;
    }

    public String getProductId() {
        return this.productID;
    }

    public void setProductID(String productID) {this.productID=productID;}


    public String getDescription() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getNumSales() {
        return this.numSales;
    }
    public void setNumSales(int numSales){this.numSales = numSales;}

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void sold(int quantity){
        this.numSales = numSales + quantity;
    }

    public boolean isNull(){
        return (Objects.equals(productID, ""));
    }
}
