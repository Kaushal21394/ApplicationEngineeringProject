/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;


import Business.ChangeMaker.ChangeMaker;
import Business.ChangeSeeker.ChangeSeeker;
import Business.Distributor.Supplier;
import Business.Distributor.Supply;
import Business.NGO.NGO;
import Business.UserAccount.UserAccount;
import Business.Volunteer.Volunteer;
import java.util.Date;

/**
 *
 * @author kaush
 */
public abstract class WorkRequest {
    private String subject;
    private UserAccount sender;
    private UserAccount reciever;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private ChangeMaker changeMaker;
    private ChangeSeeker changeSeeker;
    private NGO ngo;
    private Supplier supplier;
    private Supply supply;
    private Volunteer volunteer;
    
    public WorkRequest(){
        requestDate = new Date();
    }

    public Volunteer getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(Volunteer volunteer) {
        this.volunteer = volunteer;
    }

    
    public Supply getSupply() {
        return supply;
    }

    public void setSupply(Supply supply) {
        this.supply = supply;
    }

    
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReciever() {
        return reciever;
    }

    public void setReciever(UserAccount reciever) {
        this.reciever = reciever;
    }

    public String getStatus() {
        return status;
    }



    
    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    
    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public ChangeMaker getChangeMaker() {
        return changeMaker;
    }

    public void setChangeMaker(ChangeMaker changeMaker) {
        this.changeMaker = changeMaker;
    }

    public ChangeSeeker getChangeSeeker() {
        return changeSeeker;
    }

    public void setChangeSeeker(ChangeSeeker changeSeeker) {
        this.changeSeeker = changeSeeker;
    }

    public NGO getNgo() {
        return ngo;
    }

    public void setNgo(NGO ngo) {
        this.ngo = ngo;
    }
    
    


    @Override
    public String toString(){
        return status;
    }
}














