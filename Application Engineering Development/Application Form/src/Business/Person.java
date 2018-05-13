/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
/**
 *
 * @author kaush
 */
public class Person {
    
    private String FirstName;
    private String LastName;
    private String Age;        
    private String Gender;    
    private String emailID;
    private Address localAddress;
    private CreditCard localCC;
    private FinancialAccounts localAccount;
    private LicenseData localLicense;
    private String Filename;

    public String getFilename() {
        return Filename;
    }

    public void setFilename(String Filename) {
        this.Filename = Filename;
    }

    public Address getLocalAddress() {
        return localAddress;
    }

    public void setLocalAddress(Address localAddress) {
        this.localAddress = localAddress;
    }

    public CreditCard getLocalCC() {
        return localCC;
    }

    public void setLocalCC(CreditCard localCC) {
        this.localCC = localCC;
    }

    public FinancialAccounts getLocalAccount() {
        return localAccount;
    }

    public void setLocalAccount(FinancialAccounts localAccount) {
        this.localAccount = localAccount;
    }

    public LicenseData getLocalLicense() {
        return localLicense;
    }

    public void setLocalLicense(LicenseData localLicense) {
        this.localLicense = localLicense;
    }
    
    
    

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }
    
    
    
}








