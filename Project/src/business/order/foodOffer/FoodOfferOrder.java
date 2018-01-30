/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.order.foodOffer;

import business.workQueue.FoodOfferWorkRequest;
import java.util.ArrayList;

/**
 *
 * @author Monas
 */
public class FoodOfferOrder {
    private ArrayList<FoodOfferOrderItem> foodOfferOrderItemList;
    private int orderNumber;
    private static  int count = 0;

    public FoodOfferOrder() {
        foodOfferOrderItemList = new ArrayList<>();
        count++;
        orderNumber = count;
    }

    public ArrayList<FoodOfferOrderItem> getFoodOfferOrderItemList() {
        return foodOfferOrderItemList;
    }

    public void setFoodOfferOrderItemList(ArrayList<FoodOfferOrderItem> foodOfferOrderItemList) {
        this.foodOfferOrderItemList = foodOfferOrderItemList;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public FoodOfferOrderItem addFoodOfferOrderItem(FoodOfferWorkRequest foodOfferWorkRequest, int quantity){
        FoodOfferOrderItem orderItm = new FoodOfferOrderItem();
        orderItm.setFoodOfferWorkRequest(foodOfferWorkRequest);
        orderItm.setQuantity(quantity);
        foodOfferOrderItemList.add(orderItm);
        return orderItm;
    }
    
    public void removeOrderItem(FoodOfferOrderItem orderItem){
        foodOfferOrderItemList.remove(orderItem);
    }
}
