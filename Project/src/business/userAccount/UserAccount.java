/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.userAccount;

import business.employee.Employee;
import business.workQueue.FoodOfferWorkQueue;
import business.workQueue.UglyGroceryWorkQueue;

/**
 *
 * @author LENOVO
 */
public class UserAccount {

    private String username;
    private String password;
    private Employee employee;
    private UglyGroceryWorkQueue groceryWorkQueue;
    private FoodOfferWorkQueue foodOfferWorkQueue;

    public UserAccount() {
        groceryWorkQueue = new UglyGroceryWorkQueue();
        foodOfferWorkQueue = new FoodOfferWorkQueue();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public UglyGroceryWorkQueue getGroceryWorkQueue() {
        return groceryWorkQueue;
    }

    public FoodOfferWorkQueue getFoodOfferWorkQueue() {
        return foodOfferWorkQueue;
    }

    @Override
    public String toString() {
        return employee.getEmployeeName();
    }
}
