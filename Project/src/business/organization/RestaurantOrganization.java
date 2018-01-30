/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.product.ProductCatalog;
import business.role.RestaurantAdminRole;
import business.role.RestaurantManagerRole;
import business.role.Role;
import business.order.uglyGrocery.UglyGroceryMasterOrderCatalog;
import java.util.ArrayList;

/**
 *
 * @author Monas
 */
public class RestaurantOrganization extends Organization{

    private UglyGroceryMasterOrderCatalog uglyGroceryMasterOrderCatalog;
    private ProductCatalog productCatalog;
    
    public RestaurantOrganization(String name) {
        super(name);
        uglyGroceryMasterOrderCatalog = new UglyGroceryMasterOrderCatalog();
        productCatalog = new ProductCatalog();
    }

    public UglyGroceryMasterOrderCatalog getUglyGroceryMasterOrderCatalog() {
        return uglyGroceryMasterOrderCatalog;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RestaurantAdminRole());
        roles.add(new RestaurantManagerRole());
        return roles;
    }
        
    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }
    
}
