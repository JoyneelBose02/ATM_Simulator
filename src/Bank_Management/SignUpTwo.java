package Bank_Management;
import javax.swing.*;
import java.awt.*;
// import java.util.*;
// import java.awt.event.*;
public class SignUpTwo extends JFrame{
    JTextField panTextField, aadharTextField;
    SignUpTwo(){
        setLayout(null);
        setTitle("New Account Application Form - Page 2");

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 26));
        additionalDetails.setBounds(220,30,400,40);
        add(additionalDetails);

        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway",Font.BOLD, 18));
        religion.setBounds(140,120,100,40);
        add(religion);
        //dropdown
        String valReligion[] = {"Hindu","Muslim","Sikh","Christian","Others"};
        JComboBox religionComboBox = new JComboBox<> (valReligion);
        religionComboBox.setBounds(340,125,350,30);
        religionComboBox.setBackground(Color.WHITE);
        add(religionComboBox);

        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD, 18));
        category.setBounds(140,180,100,40);
        add(category);

        String[] valCategory = {"General","OBC","SC","ST","Others"};
        JComboBox categoryComboBox = new JComboBox<>(valCategory);
        categoryComboBox.setBounds(340,185,350,30);
        categoryComboBox.setBackground(Color.WHITE);
        add(categoryComboBox);

        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 18));
        income.setBounds(140,240,100,40);
        add(income);

        String[] valIncome = {"Null","< 1,50,000","< 2,50,00","< 5,00,000","Upto 10,00,000"};
        JComboBox incomeComboBox = new JComboBox<>(valIncome);
        incomeComboBox.setBounds(340,245,350,30);
        incomeComboBox.setBackground(Color.WHITE);
        add(incomeComboBox);

        JLabel edoc = new JLabel("Educational");
        edoc.setFont(new Font("Raleway", Font.BOLD, 18));
        edoc.setBounds(140,300,200,40);
        add(edoc);

        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway", Font.BOLD, 18));
        qualification.setBounds(140,320,200,40);
        add(qualification);

        String[] valEducation = {"Non-Graduate","Graduate","Post-Graduate","Docterate","Others"}; 
        JComboBox eduComboBox = new JComboBox<>(valEducation);
        eduComboBox.setBounds(340,325,350,30);
        eduComboBox.setBackground(Color.WHITE);
        add(eduComboBox);
 
        JLabel occupation = new JLabel("Occcupation:");
        occupation.setFont(new Font("Raleway",Font.BOLD, 18));
        occupation.setBounds(140, 380, 200, 40);
        add(occupation);

        String[] valOccupation = {"Salaried","Self-Employed","Business","Student","Retired","Others"}; 
        JComboBox occComboBox = new JComboBox<>(valOccupation);
        occComboBox.setBounds(340,385,350,30);
        occComboBox.setBackground(Color.WHITE);
        add(occComboBox);

        JLabel pan = new JLabel("PAN Number:");
        pan.setFont(new Font("Raleway", Font.BOLD, 18));
        pan.setBounds(140,440,200,40);
        add(pan);

        panTextField = new JTextField();
        panTextField.setFont(new Font("Arial", Font.BOLD, 12));
        panTextField.setBounds(340, 445, 350, 30);
        add(panTextField);

        JLabel aadhar = new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Raleway", Font.BOLD, 18));
        aadhar.setBounds(140,500,200,40);
        add(aadhar);

        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Arial", Font.BOLD, 12));
        aadharTextField.setBounds(340, 505, 350, 30);
        add(aadharTextField);

        JLabel senior = new JLabel("Senior Citizen:");
        senior.setFont(new Font("Raleway", Font.BOLD, 18));
        senior.setBounds(140,560,200,40);
        add(senior);

        JLabel exist = new JLabel("Existing Account:");
        exist.setFont(new Font("Raleway",Font.BOLD,18));
        exist.setBounds(140, 620, 200, 40);
        add(exist);

        getContentPane().setBackground(Color.LIGHT_GRAY);
        setSize(800,775);
        setLocation(350,10);
        setVisible(true);

    }
    public static void main(String[] args) {
        new SignUpTwo();
    }
}
