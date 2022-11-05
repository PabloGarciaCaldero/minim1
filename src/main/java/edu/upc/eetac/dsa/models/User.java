package edu.upc.eetac.dsa.models;

import java.util.LinkedList;
import java.util.List;

public class User {

    String Name;
    String surName;
    String userId;

    List<Order> processOrders;

    public User (String Name, String surName, String userId){
        this.Name = Name;
        this.surName = surName;
        this.userId = userId;
        this.processOrders = new LinkedList<>();
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getSurName() {
        return this.surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<Order> getProcessOrders() {
        return this.processOrders;
    }

    public void setProcessOrders(List<Order> processOrders) {
        this.processOrders = processOrders;
    }

    public void addProcessedOrder(Order order) { this.processOrders.add(order);
    }
}
