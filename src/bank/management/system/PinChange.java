
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PinChange extends JFrame implements ActionListener{
    JButton change, back;
    JPasswordField repin, pin;
    String pinnumber;
    PinChange(String pinnumber) {
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("Change Your Pin");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(250,280,500,35);
        image.add(text);
        
        JLabel pintext = new JLabel("New Pin:");
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("System", Font.BOLD, 16));
        pintext.setBounds(165,320,180,25);
        image.add(pintext);
        
        pin = new JPasswordField();
        pin.setFont(new Font("Raleway", Font.BOLD, 25));
        pin.setBounds(330,320,180,25);
        image.add(pin);
        
        JLabel repintext = new JLabel("Re-Enter New Pin:");
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("System", Font.BOLD, 16));
        repintext.setBounds(165,360,180,25);
        image.add(repintext);
        
        repin = new JPasswordField();
        repin.setFont(new Font("Raleway", Font.BOLD, 25));
        repin.setBounds(330,360,180,25);
        image.add(repin);
        
        change = new JButton("Change");
        change.setBounds(355,485,150,30);
        change.addActionListener(this);
        image.add(change);
        
        back = new JButton("Back");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);
        
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == change) {
            try {
            String npin = pin.getText();
            String rpin = repin.getText();
            
            if(!npin.equals(rpin)) {
                JOptionPane.showMessageDialog(null, "Entered Pin does not match");
                return;
            }
            
            if(npin.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter new pin");
                return;
            }
            
            if(rpin.equals("")) {
                JOptionPane.showMessageDialog(null, "Please re-enter new pin");
                return;
            }
            
            Conn c = new Conn();
            String query1 = "update bank set pin = '" + rpin + "' where pinnumber ='"+pinnumber+"'" ;
            String query2 = "update login set pin = '" + rpin + "' where Pinnumber ='"+pinnumber+"'" ;
            String query3 = "update signupthree set pin = '" + rpin + "' where PinNumber ='"+pinnumber+"'" ;
            
            c.s.executeUpdate(query1);
            c.s.executeUpdate(query2);
            c.s.executeUpdate(query3);
            
            JOptionPane.showMessageDialog(null, "Pin change Successfully");
            
            setVisible(true);
            new Transactions(rpin).setVisible(true);
            
            
        }catch(Exception e){
            System.out.print(e);
            }   
        } else {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
        
    }
    
    public static void main(String []args) {
        new PinChange("").setVisible(true);
    }
}