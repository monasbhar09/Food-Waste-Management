/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.employee.Employee;
import business.role.SystemAdminRole;
import business.userAccount.UserAccount;

/**
 *
 * @author Dhanashree Chavan
 */
public class ConfigureASystem {

    public static Ecosystem configure() {

        Ecosystem system = Ecosystem.getInstance();

        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH", new SystemAdminRole());

        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee);

        return system;
    }
}
