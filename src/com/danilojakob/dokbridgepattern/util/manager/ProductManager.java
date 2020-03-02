package com.danilojakob.dokbridgepattern.util.manager;

import com.danilojakob.dokbridgepattern.ProductType;
import com.danilojakob.dokbridgepattern.product.Product;
import com.danilojakob.dokbridgepattern.util.factory.ProductFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Manager for the products (Bridge Class)
 */
public class ProductManager {

    private List<Product> products_;

    public ProductManager() { products_ = new ArrayList<>(); }

    /**
     * Create new Product and add it to a list
     * @param productType {@link ProductType}
     * @param amount {@link int}
     * @param price {@link double}
     * @param name {@link String}
     * @param brand {@link String}
     */
    public void createNewProduct(ProductType productType, int amount, double price, String name, String brand) {
        Product product = ProductFactory.getProduct(productType);
        product.setAmount(amount);
        product.setPrice(price);
        product.setName(name);
        product.setBrand(brand);
        products_.add(product);
    }

    /**
     * Displays all products in the console
     */
    public void displayAllProducts() {
        for (Product p : products_) {
            System.out.println("Name: " + p.getName());
            System.out.println("Brand: " + p.getBrand());
            System.out.println("Amount: " + p.getAmount());
            System.out.println("Price: " + p.getPrice());
            System.out.println("Class: " + p.getClass());
            System.out.println("--------------------------------------------------");
        }
    }
}
