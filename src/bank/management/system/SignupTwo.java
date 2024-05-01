
package bank.management.system;

import javax.swing.*;
import javax.swing.JComboBox;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;


public class SignupTwo extends JFrame implements ActionListener{
    JLabel religion, category, income, education, occupation, panNumber, aadharNumber ;
    JComboBox religionText, categoryField, incomeField, occupationField, educationField;
    JTextField panTextField, aadharTextField;
    JButton next;
    JRadioButton yes1, no1, yes2, no2;
    String formno;
    
    SignupTwo(String formno){
        this.formno = formno;
        setLayout(null);
        
        setTitle("New Account Application Form - Page 2");
        
        JLabel additionalDetails  = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);
        
        //Religion
        religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway", Font.BOLD, 22));
        religion.setBounds(100, 140, 100, 30);
        add(religion);
        
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religionText = new JComboBox(valReligion);
        religionText.setBounds(300,140,400,30);
        religionText.setBackground(Color.WHITE);
        add(religionText);
        
        //Category
        category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD, 22));
        category.setBounds(100, 190, 200, 30);
        add(category);
        
        String valCategory[] = {"General", "SC", "ST", "Other"};
        categoryField = new JComboBox(valCategory);
        categoryField.setBounds(300,190,400,30);
        categoryField.setBackground(Color.WHITE);
        add(categoryField);
        
        //Income
        income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 22));
        income.setBounds(100, 240, 200, 30);
        add(income);
        
        String valIncome[] = {"Null", "less than 1", "less than 5", "less than 10"};
        incomeField = new JComboBox(valIncome);
        incomeField.setBounds(300,240,200,30);
        incomeField.setBackground(Color.WHITE);
        add(incomeField);
        
        //Education
        education = new JLabel("Education:");
        education.setFont(new Font("Raleway", Font.BOLD, 22));
        education.setBounds(100, 290, 200, 30);
        add(education);
        
        String valEducation[] = {"Graduate", "Non-Graduate"};
        educationField = new JComboBox(valEducation);
        educationField.setBounds(300,290,150,30);
        educationField.setBackground(Color.WHITE);
        add(educationField);
        
        //Occupation
        occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway", Font.BOLD, 22));
        occupation.setBounds(100, 340, 200, 30);
        add(occupation);
        
        String valOccupation[] = {"Salaried-Income", "Freelancer", "Student"};
        occupationField = new JComboBox(valOccupation);
        occupationField.setBounds(300,340,400,30);
        occupationField.setBackground(Color.WHITE);
        add(occupationField);
        
        //panNumber
        panNumber = new JLabel("PAN Number:");
        panNumber.setFont(new Font("Raleway", Font.BOLD, 22));
        panNumber.setBounds(100, 390, 200, 30);
        add(panNumber);
            
        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD,14));
        panTextField.setBounds(300,390,400,30);
        add(panTextField);
        
        //AadharNumber
        aadharNumber = new JLabel("Aadhar Number: ");
        aadharNumber.setFont(new Font("Raleway", Font.BOLD, 22));
        aadharNumber.setBounds(100, 440, 200, 30);
        add(aadharNumber);
        
        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.BOLD,14));
        aadharTextField.setBounds(300,440,400,30);
        add(aadharTextField);
        
        //Citizen
        JLabel citizen = new JLabel("Senior Citizen");
        citizen.setFont(new Font("Raleway", Font.BOLD, 22));
        citizen.setBounds(100, 490, 200, 30);
        add(citizen);
        
        yes1 = new JRadioButton("Yes");
        yes1.setBounds(300,490,100,30);
        yes1.setBackground(Color.WHITE);
        add(yes1);
        no1 = new JRadioButton("No");
        no1.setBounds(450,490,100,30);
        no1.setBackground(Color.WHITE);
        add(no1);
        
        ButtonGroup buttongrp1 = new ButtonGroup();
        buttongrp1.add(yes1);
        buttongrp1.add(no1);
        
        //Existing Account
        JLabel state = new JLabel("Existing Account:");
        state.setFont(new Font("Raleway", Font.BOLD, 22));
        state.setBounds(100, 540, 200, 30);
        add(state);
        
        yes2 = new JRadioButton("Yes");
        yes2.setBounds(300,540,100,30);
        yes2.setBackground(Color.WHITE);
        add(yes2);
        no2 = new JRadioButton("No");
        no2.setBounds(450,540,100,30);
        no2.setBackground(Color.WHITE);
        add(no2);
        
        ButtonGroup buttongrp2 = new ButtonGroup();
        buttongrp2.add(yes2);
        buttongrp2.add(no2);
        
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
//        String formno1 = formno;
        String sreligion = (String) religionText.getSelectedItem();
        String scategory = (String) categoryField.getSelectedItem();
        String sincome = (String) incomeField.getSelectedItem();
        String seducation = (String) educationField.getSelectedItem();
        String soccupation = (String) occupationField.getSelectedItem();
        String pannumber = panTextField.getText();
        String aadharnumber = aadharTextField.getText();
        
        String scitizen = null;
        if(yes1.isSelected()){
            scitizen = "Yes";
        }else {
            scitizen = "No";
        }
        
        String existingaccount = null;
        if(yes2.isSelected()){
            existingaccount = "Yes";
        }else {
            existingaccount = "No";
        }
        
        try {
            if(sreligion.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is Required");
            }else {
                Conn c = new Conn();
                String query = "insert into signuptwo values('" + formno + "','" + sreligion + "','" + scategory + "', '" + sincome + "', '" + seducation + "', '" + soccupation + "', '" + pannumber + "', '" + aadharnumber + "', '" + scitizen + "', '" + existingaccount + "')";
                c.s.executeUpdate(query); 
                
                setVisible(false);
                new SignupThree(formno).setVisible(true);
            }
        } catch (Exception e) {
            System.out.print(e);
        }
    }
    public static void main(String []args){
        new SignupTwo("");
    }
}