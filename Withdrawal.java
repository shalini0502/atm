package bank_management_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Withdrawal extends JFrame implements ActionListener{
    
    JTextField amount;
    JButton enter,clear;
    
    Withdrawal()
    {
        setTitle("Withdrawal"); 
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("ATM_icons/screen_back.jpeg"));
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel(" Enter the amount you want to withdraw: ");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD,30));
        text.setBounds(150,200,700,40);
        image.add(text);
        
        amount= new JTextField();
        amount.setFont(new Font(" Raleway", Font.BOLD,22));
        amount.setBounds(170,290,520,70);
        image.add(amount);
       
        enter = new JButton(" ENTER");
        enter.setBounds(245,425,150,50);
        enter.setFont(new Font("Raleway",Font.BOLD,22));
        enter.addActionListener(this);
        image.add(enter);
        
        clear = new JButton(" CLEAR");
        clear.setBounds(445,425,150,50);
        clear.setFont(new Font("Raleway",Font.BOLD,22));
        clear.addActionListener(this);
        image.add(clear);
        
        setSize(900,900);
         setLocation(300,0);
         setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==enter)
        {
            setVisible(false);
          Pin p= new Pin();
           p.setVisible(true);
        }
        else if(ae.getSource()==clear)
        {
            amount.setText("");
        }
    }
    public static void main( String args[])
    {
        new Withdrawal();
    }
}


