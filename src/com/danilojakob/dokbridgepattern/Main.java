package com.danilojakob.dokbridgepattern;

import com.danilojakob.dokbridgepattern.util.manager.ProductManager;

public class Main {

    private static ProductManager productManager_;

    public static void main(String[] args) {
        productManager_ = new ProductManager();
        productManager_.createNewProduct(ProductType.PHONE, 1, 999.95, "IPhone 7", "Apple");
        productManager_.createNewProduct(ProductType.COMPUTER, 4, 5999.89, "ThinkPad", "Lenovo");
        productManager_.createNewProduct(ProductType.FOOD, 2, 5.10, "Lasagna", "M-Budget");
        productManager_.displayAllProducts();
    }
}
