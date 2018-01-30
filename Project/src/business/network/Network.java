/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.network;

import business.enterprise.EnterpriseDirectory;
import business.organization.Organization;
import business.role.NetworkAdminRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Dhanashree Chavan
 */
public class Network extends Organization {

    private String networkName;
    private EnterpriseDirectory enterpriseDirectory;

    public Network(String name) {
        super(name);
        enterpriseDirectory = new EnterpriseDirectory();
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    @Override
    public String toString() {
        return networkName;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NetworkAdminRole());
        return roles;
    }
}
