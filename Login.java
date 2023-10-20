
package bank.management.system;
import javax.swing.*;

public class Login extends JFrame{
    //GDrive icon netbeans src paste icon
    Login(){
        
    setTitle("ATM");
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
//    Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALK_DEFAULT);
//    ImageIcon i3=new JLabel(i2);
//    Jlabel label=new JLabel(i3);
//    JLabel label=new JLabel(i1);
    add(label);
    setSize(800,480);
    setVisible(true);
    setLocation(350,200);
    }
    public static void main(String args[]){  
        new Login();
    }
}
