/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(String name, OrganizationType type) {
        Organization organization = null;
        if (type.getOrganization().equals(OrganizationType.Restaurant.getOrganization())) {
            organization = new RestaurantOrganization(name);
            organizationList.add(organization);
        } else if (type.getOrganization().equals(OrganizationType.Grocery.getOrganization())) {
            organization = new GroceryOrganization(name);
            organizationList.add(organization);
        } else if (type.getOrganization().equals(OrganizationType.Household.getOrganization())) {
            organization = new HouseholdOrganization(name);
            organizationList.add(organization);
        } else if (type.getOrganization().equals(OrganizationType.NGO.getOrganization())) {
            organization = new NGOOrganization(name);
            organizationList.add(organization);
        }
        return organization;
    }

}
