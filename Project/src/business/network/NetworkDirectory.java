/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.network;

import java.util.ArrayList;

/**
 *
 * @author Dhanashree Chavan
 */
public class NetworkDirectory {

    private ArrayList<Network> networkList;

    public NetworkDirectory() {
        networkList = new ArrayList<>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public Network createAndAddNetwork(String name) {
        Network network = new Network(name);
        networkList.add(network);
        return network;
    }
}
