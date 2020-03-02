package com.danilojakob.dokbridgepattern.product;

/**
 * Interface for Product common methods
 */
public interface Product {

    /**
     * Get the amount of an product
     *
     * @return {@link int}
     */
    int getAmount();

    /**
     * Get the price of an product
     *
     * @return {@link double}
     */
    double getPrice();

    /**
     * Get the name of a product
     * @return {@link String}
     */
    String getName();

    /**
     * Get the brand of a product
     * @return {@link String}
     */
    String getBrand();

    /**
     * Set the amount for a product
     * @param amount {@link int}
     */
    void setAmount(int amount);

    /**
     * Set the price for a product
     * @param price {@link double}
     */
    void setPrice(double price);

    /**
     * Set the name for a product
     * @param name {@link String}
     */
    void setName(String name);

    /**
     * Set the brand of a product
     * @param brand {@link String}
     */
    void setBrand(String brand);

    /**
     * Get Class of current implementation
     * @return {@link Class}
     */
    default Class getInputClass() {
        return this.getClass();
    }
}
