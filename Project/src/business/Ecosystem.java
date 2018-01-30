/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.network.NetworkDirectory;
import business.organization.Organization;
import business.role.Role;
import business.role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Dhanashree Chavan
 */
public class Ecosystem extends Organization {

    private static Ecosystem business;
    private NetworkDirectory networkList;

    public static Ecosystem getInstance() {
        if (business == null) {
            business = new Ecosystem();
        }
        return business;
    }

    private Ecosystem() {
        super(null);
        networkList = new NetworkDirectory();
    }

    public NetworkDirectory getNetworkList() {
        return networkList;
    }

    public void setNetworkList(NetworkDirectory networkList) {
        this.networkList = networkList;
    }

    public boolean checkIfUserNameIsUnique(String userName) {
        //complete code
        return true;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
}
