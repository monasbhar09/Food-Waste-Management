/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.Ecosystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.NGOOrganization;
import business.organization.Organization;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.organization.ngoAdminWorkArea.NGOWorkAreaJPanel;

/**
 *
 * @author Dhanashree Chavan
 */
public class NGOAdminRole extends Role {

    @Override
    public RoleType getRoleType() {
        return RoleType.NGOAdmin;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, Ecosystem business) {
        return new NGOWorkAreaJPanel(userProcessContainer, account, (NGOOrganization) organization);
    }

}
