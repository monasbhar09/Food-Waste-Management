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
public class UglyGroceryWorkQueue {
    private ArrayList<UglyGroceryWorkRequest> uglyGroceryWorkRequestList;

    public UglyGroceryWorkQueue() {
        uglyGroceryWorkRequestList = new ArrayList<>();
    }
    
    public ArrayList<UglyGroceryWorkRequest> getUglyGroceryWorkRequestList() {
        return uglyGroceryWorkRequestList;
    }

    public void setUglyGroceryWorkRequestList(ArrayList<UglyGroceryWorkRequest> uglyGroceryWorkRequestList) {
        this.uglyGroceryWorkRequestList = uglyGroceryWorkRequestList;
    }
    
    public UglyGroceryWorkRequest addUglyGroceryRequest(){
        UglyGroceryWorkRequest uglyGroceryWorkRequest = new UglyGroceryWorkRequest();
        uglyGroceryWorkRequestList.add(uglyGroceryWorkRequest);
        return uglyGroceryWorkRequest;
    }
    
}
