package com.zueras.homeshop;

import java.util.HashMap;
import java.util.Map;
import java.util.PrimitiveIterator;

public class Bill{
    private Customer customer;
    private Map<Product, Integer> products = new HashMap<Product,Integer>();
    private Delivery delivery;

    public Bill(Customer customer, Delivery delivery) {
        this.customer = customer;
        this.delivery = delivery;
    }


    public void addProduct(Product product, Integer quantity){
        this.products.put(product, quantity);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void generate(Writer writer){
        if(products.isEmpty())
            throw new NoProductionBillException();
        writer.start();
        writer.writeLine("HomeShop Compagny");
        writer.writeLine("1 place Charles de Gaulle, 75000 Paris");
        writer.writeLine("");
        writer.writeLine("Facture à l'attention de : ");
        writer.writeLine(customer.getFullname());
        writer.writeLine(customer.getAddress());
        writer.writeLine("");
        writer.writeLine("Mode de livraison : "+ delivery.getInfo());
        writer.writeLine("");
        writer.writeLine("Produits : ");
        writer.writeLine("------------------------------------------------");
        for (Map.Entry<Product,Integer> entry : products.entrySet()){
            Product product = entry.getKey();
            Integer quantity = entry.getValue();
            writer.writeLine(product.getName() + "-"+ product.getPrice() + "-"+ quantity +" unité(s)");
            writer.writeLine(product.getDescription());
            writer.writeLine("");

        }
        writer.writeLine("Livraison : "+delivery.getPrice());
        writer.writeLine("--------------------------------------------");
        writer.writeLine("Total : "+ this.getTotal());
        writer.stop();
    }

    public double getTotal(){
        double total = 0;
        for (Map.Entry<Product,Integer> entry : products.entrySet()){
            Product product = entry.getKey();
            Integer quantity = entry.getValue();
            total+= product.getPrice() + quantity;
        }
        return total;
    }
}
