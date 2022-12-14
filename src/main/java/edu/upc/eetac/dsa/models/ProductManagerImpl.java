package edu.upc.eetac.dsa.models;

import java.util.*;
import java.util.logging.Logger;

public class ProductManagerImpl implements ProductManager {

    private static ProductManager instance;
    List<Product> products;
    Map<String, User> users;
    Queue<Order> orders;

    final static Logger logger = Logger.getLogger(String.valueOf(ProductManagerImpl.class));


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
        this.products.sort((Product p1, Product p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        return this.products;
    }

    @Override
    public List<Product> productsBySales() {
        this.products.sort((Product p2, Product p1) -> Double.compare(p1.getNumSales(), p2.getNumSales()));
        return this.products;
    }

    @Override
    public void addOrder(Order order) {
        this.orders.add(order);
    }

    @Override
    public Order processOrder() {
        Order order = this.orders.poll();
        executeProcess(order);
        return order;
    }

    private void executeProcess(Order order) {
        for (LP element: order.getElements()){
            Product product = this.getProduct(element.getProduct());
            int index = products.indexOf(product);
            product.sold(element.getQuantity());
            products.set(index,product);
        }
        this.users.get(order.getUserId()).addProcessedOrder(order);
    }

    @Override
    public List<Order> ordersByUser(String userId) {
        return this.users.get(userId).getProcessOrders();
    }

    @Override
    public void addUser(String s, String name, String surname) {
        this.users.put(s, new User(s,name, surname));
    }

    @Override
    public void addProduct(String productId, String name, double price) {
    if (!getProduct(productId).isNull()){
        return;
    }
    this.products.add(new Product(productId, name, price, 0));
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
        return products.size();
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

        logger.info("size " + ret);
        return ret;
    }
}
