package edu.upc.eetac.dsa.models;

import java.util.*;

public class ProductManagerImpl implements ProductManager {

    private static ProductManager instance;
    List<Product> products;
    Map<String, User> users;
    Queue<Order> orders;

    public static ProductManagerImpl getInstance(){
        if (instance==null) instance = new ProductManagerImpl();
        return (ProductManagerImpl) instance;
    }

    public ProductManagerImpl(){
        this.products = new ArrayList<>();
        this.users = new HashMap<>();
        this.orders = new LinkedList<>();
    }


    @Override
    public List<Product> productsByPrice() {
        return null;
    }

    @Override
    public List<Product> productsBySales() {
        return null;
    }

    @Override
    public void addOrder(Order order) {

    }

    @Override
    public Order processOrder() {
        return null;
    }

    @Override
    public List<Order> ordersByUser(String userId) {
        return null;
    }

    @Override
    public void addUser(String s, String name, String surname) {

    }

    @Override
    public void addProduct(String productId, String name, double price) {

    }

    @Override
    public Product getProduct(String productId) {
        Product product = new Product("", "", 0, 0);
        for (Product p : this.products){
            if(Objects.equals(p.getProductId(), productId)){
                product = p;
            }
        }

        return product;
    }

    @Override
    public int numUsers() {
        return users.size();
    }

    @Override
    public int numProducts() {
        return this.products.size();
    }

    @Override
    public int numOrders() {
        return this.orders.size();
    }

    @Override
    public int numSales(String b001) {
        return this.getProduct(b001).getNumSales();
    }

    @Override
    public int size() {
        int ret = this.products.size();

        return 0;
    }
}
