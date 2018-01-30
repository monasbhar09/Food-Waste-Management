/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQueue;

/**
 *
 * @author Monas
 */
public enum StatusEnum {
    GroceryToSell("For Sale(Grocery Items)"),
    GroceryToDonate("For Donation(Grocery Items)"),
    RestaurantToSell("For Sale(Food Items)"),
    RestaurantToDonate("For Donation(Food Items)"),
    Expired("Expired"),
    Unavailable("Unavailable");

    private String value;

    private StatusEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
