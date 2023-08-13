package Bank_Management;
import java.awt.*;
import java.util.*;
import javax.swing.*;
public class SignUpOne extends JFrame{
  
    SignUpOne(){
        setLayout(null);
        //Application form
        Random ran = new Random();
        long random = Math.abs(ran.nextLong() % 9000L) + 1000L;
        JLabel formno = new JLabel("Application Form No. " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 30));
        formno.setBounds(220,20,600,40);
        add(formno);
        //Setting Lables and TextFields

        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 18));
        personalDetails.setBounds(300,60,400,40);
        add(personalDetails);
        
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 18));
        name.setBounds(140, 120, 100, 40);
        add(name);
        
        JLabel fname = new JLabel("Father's Name: ");
        fname.setFont(new Font("Raleway", Font.BOLD, 18));
        fname.setBounds(140, 180, 200, 40);
        add(fname);

        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 18));
        dob.setBounds(140, 240,200, 40);
        add(dob);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 18));
        gender.setBounds(140, 300,200, 40);
        add(gender);

        JLabel email = new JLabel("Email:");
        email.setFont(new Font("Raleway", Font.BOLD, 18));
        email.setBounds(140, 360,200, 40);
        add(email);

        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway",Font.BOLD, 18));
        marital.setBounds(140,420,200,40);
        add(marital);

        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD, 18));
        address.setBounds(140,480,200,40);
        add(address);

        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD, 18));
        city.setBounds(140,540,200,40);
        add(city);

        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD, 18));
        state.setBounds(140,600,200,40);
        add(state);

        JLabel pin = new JLabel("Pin Code:");
        pin.setFont(new Font("Raleway", Font.BOLD, 18));
        pin.setBounds(140, 660, 200, 40);
        add(pin);
        

        //MAking the frame
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SignUpOne();
    }
}
