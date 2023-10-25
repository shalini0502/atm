package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Locale;
import java.util.ResourceBundle;

public class Withdrawal extends JFrame implements ActionListener {
    JTextField amount;
    JButton enter, clear;
    int invalidAmountAttempts = 0;

    Withdrawal() {
        setTitle("निकासी");  // Set the title in Hindi
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ATM_icons/screen_back.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("निकासी करने की राशि दर्ज करें: "); // Enter the amount you want to withdraw
        text.setForeground(Color.WHITE);
        text.setFont(new Font("भ्रूमि", Font.BOLD, 30));
        text.setBounds(150, 200, 700, 40);
        image.add(text);

        amount = new JTextField();
        amount.setFont(new Font("रेलवे", Font.BOLD, 22));
        amount.setBounds(170, 290, 520, 70);
        image.add(amount);

        enter = new JButton("प्रवेश करें"); // ENTER
        enter.setBounds(245, 425, 150, 50);
        enter.setFont(new Font("रेलवे", Font.BOLD, 22));
        enter.addActionListener(this);
        image.add(enter);

        clear = new JButton("साफ करें"); // CLEAR
        clear.setBounds(445, 425, 150, 50);
        clear.setFont(new Font("रेलवे", Font.BOLD, 22));
        clear.addActionListener(this);
        image.add(clear);

        setSize(900, 900);
        setLocation(300, 0);
        setVisible(true);
        // Your code continues...
    }

public void actionPerformed(ActionEvent ae) {
    int invalidAmountAttempts = 0; // Initialize the error count
    
    while (invalidAmountAttempts < 3) {
        if (ae.getSource() == enter) { 
            String amountText = amount.getText();
            if (isValidPositiveNumber(amountText)) {
                // Valid input, go to the PIN page
                setVisible(false);
                Pin p = new Pin();
                p.setVisible(true);
                break; // Exit the loop when valid input is provided
            } 
            else {
                // Invalid input
                invalidAmountAttempts++;

                if (invalidAmountAttempts == 1) {
                    // First error: Show a warning
                    JOptionPane.showMessageDialog(this, "Please enter a valid positive number for the amount.");
                    amount.setText("");
                } else if (invalidAmountAttempts == 2) {
                    // Second error: Show a warning
                    JOptionPane.showMessageDialog(this, "You've entered an invalid amount twice.");
                    amount.setText("");
                    setVisible(false);
                    Transactions t=new Transactions();
                    t.setVisible(true);
                } else if (invalidAmountAttempts == 3) {
                    // Third error: Show a warning and exit the loop
                    JOptionPane.showMessageDialog(this, "You've entered an invalid amount three times. Exiting.");
                    setVisible(false);
                    break;
                }
            }
        } else if (ae.getSource() == clear) {
            amount.setText("");
        }
    }
}


private boolean isValidPositiveNumber(String input) {
    try {
        double amount = Double.parseDouble(input);
        return amount > 0;
    } catch (NumberFormatException e) {
        return false;
    }
}

    public static void main( String args[])
    {
        new Withdrawal();
    }
}

