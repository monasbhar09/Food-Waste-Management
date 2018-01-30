/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

/**
 *
 * @author LENOVO
 */
public enum OrganizationType {
    Restaurant("Restaurant Organization", "FME"), Grocery("Grocery Organization", "FME"), Household("Household Organization", "FME"), NGO("NGO Organization", "EPE");

    private final String organization;
    private final String enterprise;

    private OrganizationType(String organization, String enterprise) {
        this.organization = organization;
        this.enterprise = enterprise;
    }

    public String getOrganization() {
        return organization;
    }

    public String getEnterprise() {
        return enterprise;
    }

}
