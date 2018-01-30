/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.employee;

import business.role.Role;

/**
 *
 * @author Dhanashree Chavan
 */
public class Employee {

    private String employeeName;
    private int employeeId;
    private static int count = 1;
    private Role role;

    public Employee() {
        employeeId = count;
        count++;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return employeeName;
    }

}
