/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQueue;

import java.util.ArrayList;

/**
 *
 * @author Dhanashree Chavan
 */
public class FoodOfferWorkQueue {

    private ArrayList<FoodOfferWorkRequest> foodOfferWorkRequestList;

    public FoodOfferWorkQueue() {
        foodOfferWorkRequestList = new ArrayList<>();
    }

    public ArrayList<FoodOfferWorkRequest> getFoodOfferWorkRequestList() {
        return foodOfferWorkRequestList;
    }

    public void setFoodOfferWorkRequestList(ArrayList<FoodOfferWorkRequest> foodOfferWorkRequestList) {
        this.foodOfferWorkRequestList = foodOfferWorkRequestList;
    }

    public FoodOfferWorkRequest addFoodOfferWorkRequest() {
        FoodOfferWorkRequest foodOfferWorkRequest = new FoodOfferWorkRequest();
        foodOfferWorkRequestList.add(foodOfferWorkRequest);
        return foodOfferWorkRequest;
    }
}
