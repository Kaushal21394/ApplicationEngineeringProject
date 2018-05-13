/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.Person;
import Business.Address;
import Business.FinancialAccounts;
import Business.CreditCard;
import Business.LicenseData;
import javax.swing.ImageIcon;
/**
 *
 * @author kaush
 */
public class viewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPanel
     */

    
    public viewJPanel(Person person) {
        initComponents();
        displayPerson(person);
       
        Address address=new Address();
        
        CreditCard credit=new CreditCard();
        
        LicenseData data=new LicenseData();
        
        FinancialAccounts acc=new FinancialAccounts();
        
    }


    private void displayPerson(Person person){
        String FirstName=person.getFirstName();
        FirstNameTxt.setText(FirstName);
        String LastName=person.getLastName();
        LastNameTxt.setText(LastName);
        String Gender=person.getGender();
        GenderTxt.setText(Gender);
        String Age=person.getAge();
        AgeTxt.setText(Age);
        String emailID=person.getEmailID();
        emailIDTxt.setText(emailID);
    
        Address add1=person.getLocalAddress();
        
        String Line1=add1.getLine1();
        Line1Txt.setText(Line1);
        String Line2=add1.getLine2();
        Line2Txt.setText(Line2);
        String City=add1.getCity();
        CityTxt.setText(City);
        String ZIP=add1.getZIP();
        ZipTxt.setText(ZIP);
        String State=add1.getState();
        StateTxt.setText(State);
    
        CreditCard CC=person.getLocalCC();
        
        String CardNo=CC.getCreditCardNo();
        CardNoTxt.setText(CardNo);
        String BankName=CC.getBankName();
        BankNameTxt.setText(BankName);
        String CardType=CC.getCardType();
        CardTypeTxt.setText(CardType);
        String CardHolderName=CC.getCardHolderName();
        HolderNameTxt.setText(CardHolderName);
        String ExpDate=CC.getExpDate();
        ExpDateTxt.setText(ExpDate);
     
        LicenseData LData=person.getLocalLicense();
        
        String LicenseNo=LData.getLicenseNo();
        LicenseNoTxt.setText(LicenseNo);
        String DateOfIssue=LData.getDateOfIssue();
        DateOfIssueTxt.setText(DateOfIssue);
        String DateOfExpiry=LData.getDateOfExpiry();
        DateOfExpiryTxt.setText(DateOfExpiry);
        String DateOfBirth=LData.getDateOfBirth();
        DateOfBirthTxt.setText(DateOfBirth);
        String DClass=LData.getDClass();
        ClassTxt.setText(DClass);
        
        FinancialAccounts account=person.getLocalAccount();
        
        String cAcNo=account.getcAcNo();
        cAccountNoTxt.setText(cAcNo);
        String sAcNo=account.getsAcNo();
        sAccountNoTxt.setText(sAcNo);
        String cActive=account.getcActive();
        cActiveTxt.setText(cActive);
        String sActive=account.getsActive();
        sActiveTxt.setText(sActive);
        String cCreationDate=account.getcCreationDate();
        cCreationDatetxt.setText(cCreationDate);
        String sCreationDate=account.getsCreationDate();
        sCreationDatetxt.setText(sCreationDate);
        String cDebt=account.getcDebt();
        cDebtTxt.setText(cDebt);
        String sDebt=account.getsDebt();
        sDebtTxt.setText(sDebt);
        String cCredit=account.getcCredit();
        cCreditTxt.setText(cCredit);
        String sCredit=account.getsCredit();
        sCreditTxt.setText(sCredit);
        
        ImageIcon pick=new ImageIcon(person.getFilename());
        jLabel20.setIcon(pick);
    
    
   
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Person = new javax.swing.JLabel();
        j1 = new javax.swing.JLabel();
        FirstNameTxt = new javax.swing.JTextField();
        LastNameTxt = new javax.swing.JTextField();
        LastName = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        GenderTxt = new javax.swing.JTextField();
        AgeTxt = new javax.swing.JTextField();
        DateOfBirth = new javax.swing.JLabel();
        emailID = new javax.swing.JLabel();
        emailIDTxt = new javax.swing.JTextField();
        LicenseData = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        SSN = new javax.swing.JLabel();
        LicenseNoTxt = new javax.swing.JTextField();
        Line1 = new javax.swing.JLabel();
        Line1Txt = new javax.swing.JTextField();
        Line2Txt = new javax.swing.JTextField();
        Line2 = new javax.swing.JLabel();
        DateOfIssueTxt = new javax.swing.JTextField();
        DrivingLicenseNo = new javax.swing.JLabel();
        PassportNo = new javax.swing.JLabel();
        DateOfExpiryTxt = new javax.swing.JTextField();
        City = new javax.swing.JLabel();
        CityTxt = new javax.swing.JTextField();
        ZipTxt = new javax.swing.JTextField();
        ZIP = new javax.swing.JLabel();
        DateOfBirthTxt = new javax.swing.JTextField();
        TIN = new javax.swing.JLabel();
        VoterID = new javax.swing.JLabel();
        ClassTxt = new javax.swing.JTextField();
        State = new javax.swing.JLabel();
        StateTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cAccountNoTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        sAccountNoTxt = new javax.swing.JTextField();
        sCreationDatetxt = new javax.swing.JTextField();
        sActiveTxt = new javax.swing.JTextField();
        sDebtTxt = new javax.swing.JTextField();
        sCreditTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cCreationDatetxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cActiveTxt = new javax.swing.JTextField();
        cDebtTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cCreditTxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        CardNoTxt = new javax.swing.JTextField();
        BankNameTxt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        CardTypeTxt = new javax.swing.JTextField();
        HolderNameTxt = new javax.swing.JTextField();
        ExpDateTxt = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        Person.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Person.setText("Personal Information");

        j1.setText("First Name:");

        LastName.setText("Last Name:");

        Gender.setText("Gender:");

        DateOfBirth.setText("Age:");

        emailID.setText("email ID:");

        LicenseData.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LicenseData.setText("License Data");

        Address.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Address.setText("Address");

        SSN.setText("License No:");

        Line1.setText("Line 1:");

        Line2.setText("Line 2:");

        DrivingLicenseNo.setText("Date of Issue:");

        PassportNo.setText("Date of Expiry:");

        City.setText("City:");

        ZIP.setText("ZIP:");

        TIN.setText("Date of Birth:");

        VoterID.setText("Class:");

        State.setText("State:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Financial Accounts");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Checking Account");

        jLabel3.setText("Account No:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Savings Account ");

        jLabel9.setText("Account No:");

        sAccountNoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sAccountNoTxtActionPerformed(evt);
            }
        });

        jLabel7.setText("Credit:");

        jLabel12.setText("Debt:");

        jLabel11.setText("Active or Not:");

        jLabel10.setText("Creation Date:");

        jLabel4.setText("Creation Date:");

        jLabel5.setText("Active or Not:");

        jLabel6.setText("Debt:");

        jLabel13.setText("Credit:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Credit Card Details");

        jLabel15.setText("Card No:");

        jLabel16.setText("Bank Name:");

        jLabel17.setText("Card Holder Name:");

        jLabel18.setText("Card Type:");

        jLabel19.setText("Exp Date:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SSN)
                            .addComponent(DrivingLicenseNo)
                            .addComponent(PassportNo)
                            .addComponent(TIN)
                            .addComponent(VoterID)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel13)
                            .addComponent(LicenseData, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Person)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ExpDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CardTypeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(HolderNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BankNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CardNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LicenseNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(emailID)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(emailIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(DateOfBirth)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(AgeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Gender)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(GenderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(LastName)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(LastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(j1)
                                            .addGap(125, 125, 125)
                                            .addComponent(FirstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(DateOfIssueTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DateOfExpiryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DateOfBirthTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ClassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cAccountNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cCreationDatetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cActiveTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cDebtTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cCreditTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addComponent(Address)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Line1)
                                    .addComponent(Line2)
                                    .addComponent(City)
                                    .addComponent(ZIP)
                                    .addComponent(State)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel7))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(StateTxt)
                                    .addComponent(ZipTxt)
                                    .addComponent(CityTxt)
                                    .addComponent(Line2Txt)
                                    .addComponent(Line1Txt)
                                    .addComponent(sAccountNoTxt)
                                    .addComponent(sCreationDatetxt)
                                    .addComponent(sActiveTxt)
                                    .addComponent(sDebtTxt)
                                    .addComponent(sCreditTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(243, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Person)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(j1)
                                    .addComponent(FirstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LastName)
                                    .addComponent(LastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Gender)
                                    .addComponent(GenderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DateOfBirth))
                            .addComponent(AgeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailID)
                            .addComponent(emailIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LicenseData)
                    .addComponent(Address))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SSN)
                    .addComponent(Line1)
                    .addComponent(LicenseNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Line1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DrivingLicenseNo)
                    .addComponent(Line2)
                    .addComponent(DateOfIssueTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Line2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PassportNo)
                    .addComponent(City)
                    .addComponent(DateOfExpiryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TIN)
                    .addComponent(ZIP)
                    .addComponent(DateOfBirthTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ZipTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VoterID)
                    .addComponent(State)
                    .addComponent(ClassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel9)
                        .addComponent(sAccountNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cAccountNoTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(cCreationDatetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sCreationDatetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11)
                    .addComponent(cActiveTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sActiveTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12)
                    .addComponent(cDebtTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sDebtTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel7)
                    .addComponent(cCreditTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sCreditTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(CardNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(BankNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(HolderNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(CardTypeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(ExpDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(197, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sAccountNoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sAccountNoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sAccountNoTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JTextField AgeTxt;
    private javax.swing.JTextField BankNameTxt;
    private javax.swing.JTextField CardNoTxt;
    private javax.swing.JTextField CardTypeTxt;
    private javax.swing.JLabel City;
    private javax.swing.JTextField CityTxt;
    private javax.swing.JTextField ClassTxt;
    private javax.swing.JLabel DateOfBirth;
    private javax.swing.JTextField DateOfBirthTxt;
    private javax.swing.JTextField DateOfExpiryTxt;
    private javax.swing.JTextField DateOfIssueTxt;
    private javax.swing.JLabel DrivingLicenseNo;
    private javax.swing.JTextField ExpDateTxt;
    private javax.swing.JTextField FirstNameTxt;
    private javax.swing.JLabel Gender;
    private javax.swing.JTextField GenderTxt;
    private javax.swing.JTextField HolderNameTxt;
    private javax.swing.JLabel LastName;
    private javax.swing.JTextField LastNameTxt;
    private javax.swing.JLabel LicenseData;
    private javax.swing.JTextField LicenseNoTxt;
    private javax.swing.JLabel Line1;
    private javax.swing.JTextField Line1Txt;
    private javax.swing.JLabel Line2;
    private javax.swing.JTextField Line2Txt;
    private javax.swing.JLabel PassportNo;
    private javax.swing.JLabel Person;
    private javax.swing.JLabel SSN;
    private javax.swing.JLabel State;
    private javax.swing.JTextField StateTxt;
    private javax.swing.JLabel TIN;
    private javax.swing.JLabel VoterID;
    private javax.swing.JLabel ZIP;
    private javax.swing.JTextField ZipTxt;
    private javax.swing.JTextField cAccountNoTxt;
    private javax.swing.JTextField cActiveTxt;
    private javax.swing.JTextField cCreationDatetxt;
    private javax.swing.JTextField cCreditTxt;
    private javax.swing.JTextField cDebtTxt;
    private javax.swing.JLabel emailID;
    private javax.swing.JTextField emailIDTxt;
    private javax.swing.JLabel j1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField sAccountNoTxt;
    private javax.swing.JTextField sActiveTxt;
    private javax.swing.JTextField sCreationDatetxt;
    private javax.swing.JTextField sCreditTxt;
    private javax.swing.JTextField sDebtTxt;
    // End of variables declaration//GEN-END:variables
}

