package Bank_Management;
import javax.swing.*;
import java.awt.*;
// import java.util.*;
// import java.awt.event.*;
public class SignUpTwo extends JFrame{
    SignUpTwo(){
        setLayout(null);

        JLabel formno = new JLabel("Additional Details");
        formno.setFont(new Font("Raleway", Font.BOLD, 30));
        formno.setBounds(300,20,600,40);
        add(formno);

        getContentPane().setBackground(Color.LIGHT_GRAY);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);

    }
    public static void main(String[] args) {
        new SignUpTwo();
    }
}
