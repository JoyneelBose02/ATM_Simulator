package Bank_Management;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

// import javax.crypto.spec.DESKeySpec;
import javax.swing.*;

public class Login extends JFrame{
    Login() {
        setTitle("Automated Teller Machine");
        //To not use any layout
        setLayout(null);

        ///Loading the atm icon
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);

        //Adding text to the frame
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD,30));
        text.setBounds(200,40,400,30);
        add(text);

        JLabel cardNo = new JLabel("Card No:");
        cardNo.setFont(new Font("Raleway", Font.BOLD,22));
        cardNo.setBounds(120,150,150,30);
        add(cardNo);

        //add an entry
        JTextField cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 230, 30);
        add(cardTextField);

        JLabel pin = new JLabel("PIN");
        pin.setFont(new Font("Raleway", Font.BOLD,22));
        pin.setBounds(120,220,400,30);
        add(pin);
        
        JTextField pinTextField = new JTextField();
        pinTextField.setBounds(300, 220, 230, 30);
        add(pinTextField);

        //add button
        JButton loginButton = new JButton("SIGN IN");
        loginButton.setBounds(300, 300, 100, 30);
        loginButton.setBackground(Color.black);
        loginButton.setForeground(Color.white);
        add(loginButton);

        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(430, 300, 100, 30);
        clearButton.setBackground(Color.black);
        clearButton.setForeground(Color.white);
        add(clearButton);

        JButton signUpButton = new JButton ("Clear");
        signUpButton.setBounds(300, 350, 230, 30);
        signUpButton.setBackground(Color.black);
        signUpButton.setForeground(Color.white);
        add(signUpButton);
        
        //Change the frame background
        getContentPane().setBackground(Color.lightGray);

        //Set length and breadth of the frame
        setSize(800,500);

        //Making the frame visible using setVisible()
        setVisible(true);
        setLocation(350,200);
    }
    public static void main(String[] args) {
         new Login();
    }
}
