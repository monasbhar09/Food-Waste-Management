/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.order.foodOffer;

import java.util.ArrayList;

/**
 *
 * @author Monas
 */
public class FoodOfferMasterOrderCatalog {

    private ArrayList<FoodOfferOrder> foodOfferOrderCatalog;

    public FoodOfferMasterOrderCatalog() {
        foodOfferOrderCatalog = new ArrayList<>();
    }

    public ArrayList<FoodOfferOrder> getFoodOfferOrderCatalog() {
        return foodOfferOrderCatalog;
    }

    public void setFoodOfferOrderCatalog(ArrayList<FoodOfferOrder> foodOfferOrderCatalog) {
        this.foodOfferOrderCatalog = foodOfferOrderCatalog;
    }

    public FoodOfferOrder addOrder(FoodOfferOrder order) {
        foodOfferOrderCatalog.add(order);
        return order;
    }

    public void removeOrder(FoodOfferOrder order) {
        foodOfferOrderCatalog.remove(order);
    }
}
