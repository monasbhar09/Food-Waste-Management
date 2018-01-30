/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.order.uglyGrocery;

import business.workQueue.UglyGroceryWorkRequest;
import java.util.ArrayList;

/**
 *
 * @author Monas
 */
public class FoodOfferOrder {

    private ArrayList<UglyGroceryOrderItem> uglyGroceryOrderItemList;
    private int orderNumber;
    private static int count = 0;

    public FoodOfferOrder() {
        uglyGroceryOrderItemList = new ArrayList<>();
        count++;
        orderNumber = count;
    }

    public ArrayList<UglyGroceryOrderItem> getUglyGroceryOrderItemList() {
        return uglyGroceryOrderItemList;
    }

    public void setUglyGroceryOrderItemList(ArrayList<UglyGroceryOrderItem> uglyGroceryOrderItemList) {
        this.uglyGroceryOrderItemList = uglyGroceryOrderItemList;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public UglyGroceryOrderItem addUglyGroceryOrderItem(UglyGroceryWorkRequest uglyGroceryWorkRequest, int quantity) {
        UglyGroceryOrderItem orderItm = new UglyGroceryOrderItem();
        orderItm.setGroceryWorkRequest(uglyGroceryWorkRequest);
        orderItm.setQuantity(quantity);
        uglyGroceryOrderItemList.add(orderItm);
        return orderItm;
    }

    public void removeOrderItem(UglyGroceryOrderItem orderItem) {
        uglyGroceryOrderItemList.remove(orderItem);
    }
}
