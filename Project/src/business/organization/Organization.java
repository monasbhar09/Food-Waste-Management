/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.employee.EmployeeDirectory;
import business.role.Role;
import business.userAccount.UserAccountDirectory;
import business.workQueue.FoodOfferWorkQueue;
import business.workQueue.UglyGroceryWorkQueue;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public abstract class Organization {

    private String organizationName;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private UglyGroceryWorkQueue uglyGroceryWorkQueue;
    private FoodOfferWorkQueue foodOfferWorkQueue;
    private int organizationID;
    private static int counter;

    public Organization(String name) {
        this.organizationName = name;
        uglyGroceryWorkQueue = new UglyGroceryWorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        foodOfferWorkQueue = new FoodOfferWorkQueue();
        organizationID = counter;
        counter++;
    }

    public FoodOfferWorkQueue getFoodOfferWorkQueue() {
        return foodOfferWorkQueue;
    }

    public void setFoodOfferWorkQueue(FoodOfferWorkQueue foodOfferWorkQueue) {
        this.foodOfferWorkQueue = foodOfferWorkQueue;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public String getOrganizationName() {
        return organizationName;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public UglyGroceryWorkQueue getUglyGroceryWorkQueue() {
        return uglyGroceryWorkQueue;
    }

    public void setUglyGroceryWorkQueue(UglyGroceryWorkQueue uglyGroceryWorkQueue) {
        this.uglyGroceryWorkQueue = uglyGroceryWorkQueue;
    }

    @Override
    public String toString() {
        return organizationName;
    }
}
