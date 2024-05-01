
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.EventListener;


public class SignupThree extends JFrame implements ActionListener{
    String formno;
    JLabel AccountDetails, Account, cardnumber,cardnumbertext,randomnumber,pin, pintext, pinnumber, services;
    JRadioButton savingaccount,fdaccount, currentaccount, rdaccount;
    JCheckBox atmcard,internetbanking, mobilebanking, emailsalerts, chequebook, estatement, declaration;
    JButton submit,Cancel;
    SignupThree(String formno1){
        this.formno = formno1;
        setLayout(null);
         
        AccountDetails = new JLabel("Page 3: Account Details");
        AccountDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        AccountDetails.setBounds(290, 40, 400, 30);
        add(AccountDetails);
        
        Account = new JLabel("Account Type");
        Account.setFont(new Font("Raleway", Font.BOLD, 22));
        Account.setBounds(100, 140, 400, 30);
        add(Account);
    
        savingaccount = new JRadioButton("Saving Account");
        savingaccount.setBounds(100,180,200,30);
        savingaccount.setBackground(Color.WHITE);
        add(savingaccount);
        
        fdaccount = new JRadioButton("Fixed Deposit Account");
        fdaccount.setBounds(350,180,200,30);
        fdaccount.setBackground(Color.WHITE);
        add(fdaccount);
        
        currentaccount = new JRadioButton("Current Account");
        currentaccount.setBounds(100,210,200,30);
        currentaccount.setBackground(Color.WHITE);
        add(currentaccount);
        
        rdaccount = new JRadioButton("Recurring Deposit Account");
        rdaccount.setBounds(350,210,200,30);
        rdaccount.setBackground(Color.WHITE);
        add(rdaccount);
        
        ButtonGroup accountype = new ButtonGroup();
        accountype.add(savingaccount);
        accountype.add(fdaccount);
        accountype.add(currentaccount);
        accountype.add(rdaccount);
        
        cardnumber = new JLabel("Card Number");
        cardnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        cardnumber.setBounds(100, 260, 400, 30);
        add(cardnumber);
        cardnumbertext = new JLabel("Your 16 Digit card number");
        cardnumbertext.setFont(new Font("Raleway", Font.ITALIC, 12));
        cardnumbertext.setBounds(100, 280, 400, 30);
        add(cardnumbertext);
        
        randomnumber = new JLabel("XXXX-XXXX-XXXX-8968");
        randomnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        randomnumber.setBounds(320, 260, 400, 30);
        add(randomnumber);
        
        pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100, 340, 400, 30);
        add(pin);
        pintext = new JLabel("Your 4 Digit Password");
        pintext.setFont(new Font("Raleway", Font.ITALIC, 12));
        pintext.setBounds(100, 360, 400, 30);
        add(pintext);
        
        pinnumber = new JLabel("XXXX");
        pinnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pinnumber.setBounds(320, 340, 400, 30);
        add(pinnumber);
        
        services = new JLabel("Services Required:");
        services.setFont(new Font("Raleway", Font.BOLD, 22));
        services.setBounds(100, 410, 400, 30);
        add(services);
        
        atmcard = new JCheckBox("ATM Card");
        atmcard.setFont(new Font("Raleway", Font.BOLD, 16));
        atmcard.setBackground(Color.WHITE);
        atmcard.setBounds(100,450,200,30);
        add(atmcard);
        
        internetbanking = new JCheckBox("Internet Banking");
        internetbanking.setFont(new Font("Raleway", Font.BOLD, 16));
        internetbanking.setBackground(Color.WHITE);
        internetbanking.setBounds(300,450,200,30);
        add(internetbanking);
        
        mobilebanking = new JCheckBox("Mobile Banking");
        mobilebanking.setFont(new Font("Raleway", Font.BOLD, 16));
        mobilebanking.setBackground(Color.WHITE);
        mobilebanking.setBounds(100,490,200,30);
        add(mobilebanking);
        
        emailsalerts = new JCheckBox("Emails & Sms Alerts");
        emailsalerts.setFont(new Font("Raleway", Font.BOLD, 16));
        emailsalerts.setBackground(Color.WHITE);
        emailsalerts.setBounds(300,490,200,30);
        add(emailsalerts);
        
        chequebook = new JCheckBox("Cheque Book");
        chequebook.setFont(new Font("Raleway", Font.BOLD, 16));
        chequebook.setBackground(Color.WHITE);
        chequebook.setBounds(100,530,200,30);
        add(chequebook);
        
        estatement = new JCheckBox("E-Statement");
        estatement.setFont(new Font("Raleway", Font.BOLD, 16));
        estatement.setBackground(Color.WHITE);
        estatement.setBounds(300,530,200,30);
        add(estatement);
        
        declaration = new JCheckBox("I hereby declare that the above entered information is correct to the best of my knowledge.");
        declaration.setFont(new Font("Raleway", Font.BOLD, 12));
        declaration.setBackground(Color.WHITE);
        declaration.setBounds(100,610,800,30);
        add(declaration);
                
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBounds(300, 660, 100, 30);
        submit.addActionListener(this);
        add(submit);
        
        Cancel = new JButton("Cancel");
        Cancel.setBackground(Color.BLACK);
        Cancel.setForeground(Color.WHITE);
        Cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        Cancel.setBounds(460, 660, 100, 30);
        Cancel.addActionListener(this);
        add(Cancel);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submit){
            if(!(declaration.isSelected())) {
                JOptionPane.showMessageDialog(null, "Tick on declaration");
            }
            String accounttype = null;
            if(savingaccount.isSelected()){
                accounttype = "Saving Account";
            }else if(fdaccount.isSelected()){
                accounttype = "Fixed Deposit Account";
            }else if(currentaccount.isSelected()){
                accounttype = "Current Account";
            }else if(rdaccount.isSelected()){
                accounttype = "Recurring Deposit Account";
            }
            
            Random random = new Random();
            String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 504093600000000L);
            String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
            
            
            String facility = "";
            if(atmcard.isSelected()) {
                facility = facility + "ATM Card";
            }else if(internetbanking.isSelected()) {
                facility = facility + "Internet Banking";
            }else if(mobilebanking.isSelected()) {
                facility = facility + "Mobile Banking";
            }else if(emailsalerts.isSelected()) {
                facility = facility + "Email Alerts";
            }else if(chequebook.isSelected()) {
                facility = facility + "Chequebook";
            }else if(estatement.isSelected()) {
                facility = facility + "E-statement";
            }
            
            try {
                if(accounttype.equals("")){
                    JOptionPane.showMessageDialog(null, "Account type is Required");
                }else {
                    Conn c = new Conn();
                    String query = "insert into signupthree values('"+ formno + "','"+ accounttype + "','"+ cardnumber + "','"+ pinnumber + "','"+ facility + "')";
                    String query2 = "insert into login values('"+ formno + "','"+ cardnumber + "','"+ pinnumber + "')";
                    c.s.executeUpdate(query);
                    c.s.executeUpdate(query2);
                    
                    JOptionPane.showMessageDialog(null, "Card number: " + cardnumber+ "\n Pin: " + pinnumber);
                    
                    setVisible(false);
                    new Deposit(pinnumber).setVisible(true);
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }else if(ae.getSource() == Cancel){
            setVisible(false);
            new Login().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new SignupThree("");
    }
}