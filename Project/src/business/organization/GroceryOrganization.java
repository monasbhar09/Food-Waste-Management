/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.product.ProductCatalog;
import business.role.GroceryAdminRole;
import business.role.GroceryManagerRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Monas
 */
public class GroceryOrganization extends Organization {

    private ProductCatalog productCatalog;

    public GroceryOrganization(String name) {
        super(name);
        productCatalog = new ProductCatalog();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GroceryAdminRole());
        roles.add(new GroceryManagerRole());
        return roles;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }
}
