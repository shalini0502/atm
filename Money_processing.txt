
package bank_management_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class moneyprocessing extends JFrame{
    
   JProgressBar loading;
   Timer timer;
   JLayeredPane Pane;
   
    
    moneyprocessing()
    {
        Pane= new JLayeredPane();
        setContentPane(Pane);
        
        
        setTitle("moneyprocessing"); 
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("ATM_icons/screen_back.jpeg"));
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel(" your money is being processed ");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD,30));
        text.setBounds(150,200,700,40);
        image.add(text);
        
        loading= new JProgressBar(0,100);
        loading.setIndeterminate(true);
        loading. setString("Processing...");
        loading.setStringPainted(true);
        add(loading,BorderLayout.CENTER);
        loading.setBounds(200,200,300,50);
//        image.add(loading);
        Pane.add(image,Integer.valueOf(1));
        Pane.add(loading,Integer.valueOf(2));

        timer=new Timer(1000, new ActionListener()
        {
            int progress=0;
        public void actionPerformed(ActionEvent e)
        {
            if(progress<100)
            {
                progress+=10;
                loading.setValue(progress);
            }
            else
            {
                ((Timer) e.getSource()).stop();
                loading.setString("Completed");
            }
        }
        });
        timer.start();
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
    }
    
    public static void main( String args[])
    {
        SwingUtilities.invokeLater(new Runnable(){
            public void run()
            {
                new moneyprocessing();
            }
        });
        
    }
}



