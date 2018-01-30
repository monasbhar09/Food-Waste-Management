/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.order.uglyGrocery;

import business.workQueue.UglyGroceryWorkRequest;

/**
 *
 * @author Monas
 */
public class UglyGroceryOrderItem {

    private int quantity;
    private UglyGroceryWorkRequest groceryWorkRequest;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public UglyGroceryWorkRequest getGroceryWorkRequest() {
        return groceryWorkRequest;
    }

    public void setGroceryWorkRequest(UglyGroceryWorkRequest groceryWorkRequest) {
        this.groceryWorkRequest = groceryWorkRequest;
    }

    @Override
    public String toString() {
        return this.groceryWorkRequest.getProduct().getProductName();
    }
}
