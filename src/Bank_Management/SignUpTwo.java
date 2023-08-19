package Bank_Management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// import java.util.*;
// import java.awt.event.*;
public class SignUpTwo extends JFrame implements ActionListener{
    
    JTextField panTextField, aadharTextField;
    JComboBox religionComboBox, incomeComboBox, eduComboBox, categoryComboBox, occComboBox;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    String formno;
    SignUpTwo(String formno){
        this.formno = formno;
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
        religionComboBox = new JComboBox<> (valReligion);
        religionComboBox.setBounds(340,125,350,30);
        religionComboBox.setBackground(Color.WHITE);
        add(religionComboBox);

        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD, 18));
        category.setBounds(140,180,100,40);
        add(category);

        String[] valCategory = {"General","OBC","SC","ST","Others"};
        categoryComboBox = new JComboBox<>(valCategory);
        categoryComboBox.setBounds(340,185,350,30);
        categoryComboBox.setBackground(Color.WHITE);
        add(categoryComboBox);

        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 18));
        income.setBounds(140,240,100,40);
        add(income);

        String[] valIncome = {"Null","< 1,50,000","< 2,50,00","< 5,00,000","Upto 10,00,000"};
        incomeComboBox = new JComboBox<>(valIncome);
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
        eduComboBox = new JComboBox<>(valEducation);
        eduComboBox.setBounds(340,325,350,30);
        eduComboBox.setBackground(Color.WHITE);
        add(eduComboBox);
 
        JLabel occupation = new JLabel("Occcupation:");
        occupation.setFont(new Font("Raleway",Font.BOLD, 18));
        occupation.setBounds(140, 380, 200, 40);
        add(occupation);

        String[] valOccupation = {"Salaried","Self-Employed","Business","Student","Retired","Others"}; 
        occComboBox = new JComboBox<>(valOccupation);
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

        syes = new JRadioButton("Yes");
        syes.setBounds(340,565,90,35);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(500,565,90,35);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup seniorButtonGroup = new ButtonGroup();
        seniorButtonGroup.add(syes);
        seniorButtonGroup.add(sno);

        JLabel exist = new JLabel("Existing Account:");
        exist.setFont(new Font("Raleway",Font.BOLD,18));
        exist.setBounds(140, 620, 200, 40);
        add(exist);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(340,625,90,35);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(500,625,90,35);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup existButtonGroup = new ButtonGroup();
        existButtonGroup.add(eyes);
        existButtonGroup.add(eno);
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway",Font.BOLD, 15));
        next.setBounds(620,680, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.LIGHT_GRAY);
        setSize(800,775);
        setLocation(350,10);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        String sReligion = (String) religionComboBox.getSelectedItem();
        String sCategory = (String) categoryComboBox.getSelectedItem();
        String sIncome = (String) incomeComboBox.getSelectedItem();
        String sEducation = (String) eduComboBox.getSelectedItem();
        String sOccupation = (String) occComboBox.getSelectedItem();
        String seniorCitizen = null;
        if(syes.isSelected()){
             seniorCitizen = "Yes";
        }
        else if(sno.isSelected()){
            seniorCitizen = "No";
        }
        String existingAccount = null;
        if(eyes.isSelected()){
            existingAccount = "Yes";
        }
        else if(eno.isSelected()){
            existingAccount = "No";
        }
        String sPan = panTextField.getText();
        String sAadhar = aadharTextField.getText();
        try{
            Conn c = new Conn();
            String query = "INSERT into signuptwo values('" + formno + "', ' "+ sReligion + "', '" + sCategory + " ', ' " + sIncome + " ' , ' " + sEducation + " ', ' " + sOccupation + " ', ' " + sPan + " ', ' " + sAadhar + " ', ' " + seniorCitizen + " ', ' " + existingAccount + " ')";
            c.s.executeUpdate(query);
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        new SignUpTwo(" ");
    }
}
