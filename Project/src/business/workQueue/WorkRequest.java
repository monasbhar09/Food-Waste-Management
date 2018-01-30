/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQueue;

import business.organization.Organization;
import business.userAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Dhanashree Chavan
 */
public abstract class WorkRequest {

    private UserAccount sender;
    private ArrayList<Organization> receiverList;
    private StatusEnum status;
    private long requestDate;
    private Date date;

    public WorkRequest() {

        date = new Date();
        requestDate = System.currentTimeMillis();
        receiverList = new ArrayList<>();

    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public ArrayList<Organization> getReceiverList() {
        return receiverList;
    }

    public void setReceiverList(ArrayList<Organization> receiverList) {
        this.receiverList = receiverList;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public long getRequestDate() {
        return requestDate;
    }

    public Date getDate() {
        return date;
    }

    public void checkExpired() {
        
        //Data population Purpose
        /*long timeInMin = (System.currentTimeMillis() - this.requestDate) / (1000 * 60);
        if (timeInMin >= 5) {
            this.setStatus(StatusEnum.Expired);
        }*/
        long timeInMin = (System.currentTimeMillis() - this.requestDate) / (1000 * 60*60);
        if (timeInMin >= 24) {
            this.setStatus(StatusEnum.Expired);
        }
    }
}
