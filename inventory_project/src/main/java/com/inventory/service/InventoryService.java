package com.inventory.service;

import com.inventory.model.Product;

import java.util.ArrayList;
import java.util.List;

public class InventoryService {
    private List<Product> products;

    public InventoryService() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void removeProduct(String productId) {
        products.removeIf(product -> product.getId().equals(productId));
    }

    public Product findProductById(String productId) {
        for (Product product : products) {
            if (product.getId().equals(productId)) {
                return product;
            }
        }
        return null;
    }
}
