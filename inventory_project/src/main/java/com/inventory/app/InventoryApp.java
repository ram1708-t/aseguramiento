package com.inventory.app;

import com.inventory.model.Product;
import com.inventory.service.InventoryService;

import java.util.List;

public class InventoryApp {
    public static void main(String[] args) {
        InventoryService inventoryService = new InventoryService();

        Product product1 = new Product("1", "Laptop", "Electronics", 50);
        Product product2 = new Product("2", "Chair", "Furniture", 150);
        Product product3 = new Product("3", "Pen", "Stationery", 500);

        inventoryService.addProduct(product1);
        inventoryService.addProduct(product2);
        inventoryService.addProduct(product3);

        System.out.println("All Products:");
        List<Product> products = inventoryService.getProducts();
        for (Product product : products) {
            System.out.println(product);
        }

        System.out.println("Finding Product with ID 2:");
        Product foundProduct = inventoryService.findProductById("2");
        System.out.println(foundProduct);

        System.out.println("Removing Product with ID 3:");
        inventoryService.removeProduct("3");

        System.out.println("All Products after removal:");
        products = inventoryService.getProducts();
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
