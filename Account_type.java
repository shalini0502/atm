
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Account_Type extends JFrame implements ActionListener{
    
    JTextField amount;
    JButton S_ACC,C_ACC;
    
    Account_Type()
    {
        setTitle("Withdrawal"); 
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("ATM_icons/screen_back.jpeg"));
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel(" Choose the account type : ");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD,30));
        text.setBounds(250,200,700,40);
        image.add(text);
        
 
       
        C_ACC = new JButton(" CURRENT ACCOUNT");
        C_ACC.setBounds(0,425,250,50);
        C_ACC.setFont(new Font("Raleway",Font.BOLD,15));
        C_ACC.addActionListener(this);
        image.add(C_ACC);
        
        S_ACC = new JButton(" SAVINGS ACCOUNT");
        S_ACC.setBounds(635,425,250,50);
        S_ACC.setFont(new Font("Raleway",Font.BOLD,15));
        S_ACC.addActionListener(this);
        image.add(S_ACC);
        
        setSize(900,900);
         setLocation(300,0);
         setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==S_ACC)
        {
            setVisible(false);
          Withdrawal w= new Withdrawal();
           w.setVisible(true);
        }
        else if(ae.getSource()==C_ACC)
        {
            setVisible(false);
            Withdrawal w= new Withdrawal();
            w.setVisible(true);
            
        }
    }
    public static void main( String args[])
    {
        new Account_Type();
    }
}


