package Bank_Management;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;


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
        //name label
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 18));
        name.setBounds(140, 120, 100, 40);
        add(name);
        
        //name textfield
        JTextField nameTextField = new JTextField();
        nameTextField.setBounds(350, 120, 300, 35);
        nameTextField.setFont(new Font("Arial", Font.BOLD, 12));
        add(nameTextField);
        
        JLabel fname = new JLabel("Father's Name: ");
        fname.setFont(new Font("Raleway", Font.BOLD, 18));
        fname.setBounds(140, 180, 200, 40);
        add(fname);

        //fname textfield
        JTextField fnameTextField = new JTextField();
        fnameTextField.setBounds(350, 180, 300, 35);
        fnameTextField.setFont(new Font("Arial", Font.BOLD, 12));
        add(fnameTextField);

        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 18));
        dob.setBounds(140, 240,200, 40);
        add(dob);

        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(350,240,300,35);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 18));
        gender.setBounds(140, 300,200, 40);
        add(gender);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(350,300,90,35);
        male.setBackground(Color.WHITE);
        add(male);
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(450,300,90,35);
        female.setBackground(Color.WHITE);
        add(female);
        //Button group helps in choosing only one radio button
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        JLabel email = new JLabel("Email:");
        email.setFont(new Font("Raleway", Font.BOLD, 18));
        email.setBounds(140, 360,200, 40);
        add(email);

        JTextField emailTextField = new JTextField();
        emailTextField.setBounds(350, 360, 300, 35);
        emailTextField.setFont(new Font("Arial", Font.BOLD, 12));
        add(emailTextField);

        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway",Font.BOLD, 18));
        marital.setBounds(140,420,200,40);
        add(marital);

        JRadioButton married = new JRadioButton("Married");
        married.setBounds(350,420,90,35);
        married.setBackground(Color.WHITE);
        add(married);
        JRadioButton unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450,420,90,35);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        JRadioButton other = new JRadioButton("Other");
        other.setBounds(550,420,90,35);
        other.setBackground(Color.WHITE);
        add(other);

        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(other);

        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD, 18));
        address.setBounds(140,480,200,40);
        add(address);

        JTextField addressTextField = new JTextField();
        addressTextField.setBounds(350, 480, 300, 35);
        addressTextField.setFont(new Font("Arial", Font.BOLD, 12));
        add(addressTextField);

        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD, 18));
        city.setBounds(140,540,200,40);
        add(city);

        JTextField cityTextField = new JTextField();
        cityTextField.setBounds(350, 540, 300, 35);
        cityTextField.setFont(new Font("Arial", Font.BOLD, 12));
        add(cityTextField);

        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD, 18));
        state.setBounds(140,600,200,40);
        add(state);

        JTextField stateTextField = new JTextField();
        stateTextField.setBounds(350, 600, 300, 35);
        stateTextField.setFont(new Font("Arial", Font.BOLD, 12));
        add(stateTextField);

        JLabel pin = new JLabel("Pin Code:");
        pin.setFont(new Font("Raleway", Font.BOLD, 18));
        pin.setBounds(140, 660, 200, 40);
        add(pin);

        JTextField pinTextField = new JTextField();
        pinTextField.setBounds(350, 660, 300, 35);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 12));
        add(pinTextField);        

        JButton next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway",Font.BOLD, 15));
        next.setBounds(650,720, 80, 30);
        add(next);
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
