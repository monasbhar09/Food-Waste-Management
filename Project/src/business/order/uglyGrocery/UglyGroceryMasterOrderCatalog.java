/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.order.uglyGrocery;

import java.util.ArrayList;

/**
 *
 * @author Monas
 */
public class UglyGroceryMasterOrderCatalog {

    private ArrayList<FoodOfferOrder> uglyGroceryOrderCatalog;

    public UglyGroceryMasterOrderCatalog() {
        uglyGroceryOrderCatalog = new ArrayList<>();
    }

    public ArrayList<FoodOfferOrder> getUglyGroceryOrderCatalog() {
        return uglyGroceryOrderCatalog;
    }

    public void setUglyGroceryOrderCatalog(ArrayList<FoodOfferOrder> uglyGroceryOrderCatalog) {
        this.uglyGroceryOrderCatalog = uglyGroceryOrderCatalog;
    }

    public FoodOfferOrder addOrder(FoodOfferOrder order) {
        uglyGroceryOrderCatalog.add(order);
        return order;
    }

    public void removeOrder(FoodOfferOrder order) {
        uglyGroceryOrderCatalog.remove(order);
    }
}
