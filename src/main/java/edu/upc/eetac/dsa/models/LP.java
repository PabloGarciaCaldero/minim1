package edu.upc.eetac.dsa.models;

public class LP {
    public LP(){}

    int quantity;
    String product;

    public LP (int quantity, String product){
        this.product = product;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String getProduct() {
        return product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}

