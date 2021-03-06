/*
 * TCSS 305 - Fall 2019
 * Assignment 1 - Online Bookstore Application
 * Assignment 2- Interface Extensions and Unit Tests
 * This class creates an order for online bookstore.
 */

package model;

import java.util.Objects;

/**
 * This class will create all properties of an order.
 * @author Hung Vu
 * @version 27 10 2019
 */
public final class ItemOrder {
    /**
     * Instance field myItem contains item's name.
     */
    private final Item myItem;
    /**
     * Instance field myItem contains item's quantity.
     */
    private final int myQuantity;
    /**
     * Default constructor for item order.
     * @param theItem item in the order
     * @param theQuantity quantity of item in the order
     */
    public ItemOrder(final Item theItem, final int theQuantity) {
        if (theItem == null) {
            throw new NullPointerException("Invalid item.");
        }
        if (theQuantity < 0) {
            throw new IndexOutOfBoundsException("Quantity should be greater or equal 0.");
        }
        myItem = theItem;
        myQuantity = theQuantity;
    }

    /**
     * Return item in the order.
     * @return item in the order
     */
    public Item getItem() {
        return myItem;
    }
    
    /**
     * Return quantity of item.
     * @return quantity of item
     */
    public int getQuantity() {
        return myQuantity;
    }

    @Override
    /**
     * This method will override toString method with required print statement.
     * General format: 'Item's name', qty: 'item's quantity'
     */
    public String toString() {
        return myItem + ", qty: " + myQuantity;
    }
    @Override
    /**
     * This method will override default equals method. It will compare two objects together.
     * They are only equals when all given fields are the same, 
     * or they have the same reference. It will compare their reference, 
     * class type, order's item name, and order's quantity.
     */
    public boolean equals(final Object theOther) {
        if (this == theOther) {
            return true;
        }
        if (theOther == null || !(theOther instanceof ItemOrder)) {
            return false;
        } else {
            final ItemOrder otherOrder = (ItemOrder) theOther;
            return myItem == otherOrder.myItem && myQuantity == otherOrder.myQuantity; 
        }
    }
    @Override
    /**
     * This method will override default hashCode method 
     * and provide specific hash code for ItemOrder
     */
    public int hashCode() {
        return Objects.hash(myItem, myQuantity);
    }

}
