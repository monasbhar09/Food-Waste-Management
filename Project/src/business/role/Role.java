/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.Ecosystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.userAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public abstract class Role {

    public enum RoleType {
        SystemAdmin("System Admin"),
        NetworkAdmin("Network Admin"),
        EnterpriseAdmin("Enterprise Admin"),
        RestaurantAdmin("Restaurant Admin"),
        GroceryAdmin("Grocery Admin"),
        HouseholdAdmin("Household Admin"),
        RestaurantManager("Restaurant Manager"),
        GroceryManager("Grocery Manager"),
        NGOAdmin("NGO Admin");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public abstract RoleType getRoleType();

    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            Network network,
            Ecosystem business);

    @Override
    public String toString() {
        return this.getRoleType().getValue();
    }

}
