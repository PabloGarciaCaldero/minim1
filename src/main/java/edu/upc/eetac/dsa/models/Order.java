package edu.upc.eetac.dsa.models;

import java.util.LinkedList;

public class Order {
    String userId;
    LinkedList<LP> elements;

    public Order(String userId) {
        this.userId = userId;
        this.elements = new LinkedList<>();
    }

    public void addLP(int i, String b001) {
        elements.add(new LP(i,b001));
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LinkedList<LP> getElements() {
        return elements;
    }

    public void setElements(LinkedList<LP> elements) {
        this.elements = elements;
    }

    public LP getLP(int i) {
        return elements.get(i);
    }
}
