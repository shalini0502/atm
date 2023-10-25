// ATM
package bank_management_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Transactions extends JFrame implements ActionListener{
    JButton Deposit, Withdraw_Money,Change_pin,Check_bal;
 
    Transactions()
    {
      
        setLayout(null);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("ATM_icons/screen_back.jpeg"));
        Image i2= i1.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
         image.setBounds(0, 0, 900, 900);
         add(image);
         
        JLabel text= new JLabel("Select the transaction to perform");
        text.setBounds(120, 200, 700, 50);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,40));
        image.add(text);
         
        Deposit= new JButton("Deposit");
        Deposit.setBounds(000,415,250,50);
        Deposit.setBackground(Color.WHITE);
        Deposit.addActionListener(this);
        image.add(Deposit);
         
        Withdraw_Money= new JButton("Withdraw Money");
        Withdraw_Money.setBounds(000,515,250,50);
        Withdraw_Money.setBackground(Color.WHITE);
        Withdraw_Money.addActionListener(this);
        image.add(Withdraw_Money);
       
        Change_pin= new JButton("Change PIN");
        Change_pin.setBounds(660,415,250,50);
        Change_pin.setBackground(Color.WHITE);
        Change_pin.addActionListener(this);
        image.add(Change_pin);
        
        Check_bal= new JButton("Check Balance");
        Check_bal.setBounds(660,515,250,50);
        Check_bal.setBackground(Color.WHITE);
        Check_bal.addActionListener(this);
        image.add(Check_bal);
         
         
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true); 
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==Withdraw_Money)
        {
            setVisible(false);
           
            Account_Type ac= new Account_Type();
            ac.setVisible(true);  
        }
        if(ae.getSource()==Check_bal)
        {
            setVisible(false);
            
            Account_Type ac= new Account_Type();
            ac.setVisible(true);  
        }
    }
    public static void main( String args[])
    {
        new Transactions();
    }
}
