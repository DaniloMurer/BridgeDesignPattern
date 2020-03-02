package com.danilojakob.dokbridgepattern.util.factory;

import com.danilojakob.dokbridgepattern.ProductType;
import com.danilojakob.dokbridgepattern.product.Food;
import com.danilojakob.dokbridgepattern.product.Laptop;
import com.danilojakob.dokbridgepattern.product.Phone;
import com.danilojakob.dokbridgepattern.product.Product;

/**
 * Factory for products
 */
public class ProductFactory {

    /**
     * Get a product based on the type
     * @param productType {@link ProductType}
     * @return {@link Product}
     */
    public static Product getProduct(ProductType productType) {
        if (productType == ProductType.PHONE) {
            return new Phone();
        } else if (productType == ProductType.COMPUTER) {
            return new Laptop();
        } else if (productType == ProductType.FOOD) {
            return new Food();
        }
        return null;
    }
}
