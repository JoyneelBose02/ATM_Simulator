package Bank_Management;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
//Use JDateChooser to use calendar
import com.toedter.calendar.JDateChooser;


public class SignUpOne extends JFrame implements ActionListener{
    long random;
    JTextField nameTextField, fnameTextField, dobTextField, emailTextField, addressTextField, cityTextField, stateTextField, pinTextField;
    JButton next;
    JRadioButton male, female, married, unmarried, other;
    JDateChooser dateChooser;
    SignUpOne(){
        setLayout(null);
        //Application form
        Random ran = new Random();
        random = Math.abs(ran.nextLong() % 9000L) + 1000L;

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
        nameTextField = new JTextField();
        nameTextField.setBounds(350, 120, 300, 35);
        nameTextField.setFont(new Font("Arial", Font.BOLD, 12));
        add(nameTextField);
        
        JLabel fname = new JLabel("Father's Name: ");
        fname.setFont(new Font("Raleway", Font.BOLD, 18));
        fname.setBounds(140, 180, 200, 40);
        add(fname);

        //fname textfield
        fnameTextField = new JTextField();
        fnameTextField.setBounds(350, 180, 300, 35);
        fnameTextField.setFont(new Font("Arial", Font.BOLD, 12));
        add(fnameTextField);

        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 18));
        dob.setBounds(140, 240,200, 40);
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(350,240,300,35);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 18));
        gender.setBounds(140, 300,200, 40);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(350,300,90,35);
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("Female");
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

        emailTextField = new JTextField();
        emailTextField.setBounds(350, 360, 300, 35);
        emailTextField.setFont(new Font("Arial", Font.BOLD, 12));
        add(emailTextField);

        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway",Font.BOLD, 18));
        marital.setBounds(140,420,200,40);
        add(marital);

        married = new JRadioButton("Married");
        married.setBounds(350,420,90,35);
        married.setBackground(Color.WHITE);
        add(married);
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450,420,90,35);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        other = new JRadioButton("Other");
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

        addressTextField = new JTextField();
        addressTextField.setBounds(350, 480, 300, 35);
        addressTextField.setFont(new Font("Arial", Font.BOLD, 12));
        add(addressTextField);

        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD, 18));
        city.setBounds(140,540,200,40);
        add(city);

        cityTextField = new JTextField();
        cityTextField.setBounds(350, 540, 300, 35);
        cityTextField.setFont(new Font("Arial", Font.BOLD, 12));
        add(cityTextField);

        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD, 18));
        state.setBounds(140,600,200,40);
        add(state);

        stateTextField = new JTextField();
        stateTextField.setBounds(350, 600, 300, 35);
        stateTextField.setFont(new Font("Arial", Font.BOLD, 12));
        add(stateTextField);

        JLabel pin = new JLabel("Pin Code:");
        pin.setFont(new Font("Raleway", Font.BOLD, 18));
        pin.setBounds(140, 660, 200, 40);
        add(pin);

        pinTextField = new JTextField();
        pinTextField.setBounds(350, 660, 300, 35);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 12));
        add(pinTextField);        

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway",Font.BOLD, 15));
        next.setBounds(650,720, 80, 30);
        next.addActionListener(this);
        add(next);
        //MAking the frame
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        String formno = "" + random; //long to string 
        String name = nameTextField.getText(); //to extract the value in the object
        String fname = fnameTextField.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        }
        else if(female.isSelected()){
            gender = "Female";
        }

        String email = emailTextField.getText();
        String marital = null;
        if(married.isSelected()){
            marital = "Married";
        }
        else if(unmarried.isSelected()){
            marital = "Unmarried";
        }
        else if(other.isSelected()){
            marital = "Other";
        }
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pinTextField.getText();

        try{
            //Any validation message if necessary "Name is required";
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is Required");
            }
            if(fname.equals("")){
                JOptionPane.showMessageDialog(null, "Father's Name is Required");
            }
            if(email.equals("")){
                JOptionPane.showMessageDialog(null, "Email is Required");
            }
            if(address.equals("")){
                JOptionPane.showMessageDialog(null, "Address is Required");
            }
            if(state.equals("")){
                JOptionPane.showMessageDialog(null, "State is Required");
            }
            if(city.equals("")){
                JOptionPane.showMessageDialog(null, "City is Required");
            }
            if(pin.equals("")){
                JOptionPane.showMessageDialog(null, "Pin is Required");
            }
            else{
                Conn c = new Conn();
                String query = "INSERT into signup values('" + formno + "', ' "+ name + "', '" + fname + " ', ' " + dob + " ' , ' " + gender + " ', ' " + email + " ', ' " + marital + " ', ' " + address + " ', ' " + city + " ', ' " + pin + " ', ' " + state + " ')"; 
                c.s.executeUpdate(query);

                setVisible(false);
                new SignUpTwo(formno).setVisible(true);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        new SignUpOne();
    }
}
