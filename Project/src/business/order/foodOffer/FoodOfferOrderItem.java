/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.order.foodOffer;

import business.workQueue.FoodOfferWorkRequest;

/**
 *
 * @author Monas
 */
public class FoodOfferOrderItem {

    private int quantity;
    private FoodOfferWorkRequest foodOfferWorkRequest;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public FoodOfferWorkRequest getFoodOfferWorkRequest() {
        return foodOfferWorkRequest;
    }

    public void setFoodOfferWorkRequest(FoodOfferWorkRequest foodOfferWorkRequest) {
        this.foodOfferWorkRequest = foodOfferWorkRequest;
    }

    @Override
    public String toString() {
        return this.foodOfferWorkRequest.getProduct().getProductName();
    }
}
