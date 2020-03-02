package com.danilojakob.dokbridgepattern.product;

public abstract class AbstractProduct implements Product {

    //Attributes
    protected int amount_ = 0;
    protected double price_ = 0.0;
    protected String name_ = "";
    protected String brand_ = "";

    /**
     * All Methods from {@link Product} are overidden in the implementation class
     */
}
