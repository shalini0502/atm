
package bank_management_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pin extends JFrame implements ActionListener{
    
    JTextField pin;
    JButton enter,clear;
    
    Pin()
    {
        setTitle("Pin"); 
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("ATM_icons/screen_back.jpeg"));
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel(" Enter the Pin number ");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD,30));
        text.setBounds(150,200,700,40);
        image.add(text);
        
        pin= new JTextField();
        pin.setFont(new Font(" Raleway", Font.BOLD,22));
        pin.setBounds(170,290,520,70);
        image.add(pin);
       
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
            moneyprocessing mp= new moneyprocessing();
            mp.setVisible(true);
        }
        else if(ae.getSource()==clear)
        {
            pin.setText("");
        }
    }
    public static void main( String args[])
    {
        new Pin();
    }
}


