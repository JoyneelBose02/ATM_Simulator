package Bank_Management;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;
public class SignUpThree extends JFrame implements ActionListener {
    JRadioButton  r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit, cancel;
    String formno;
    SignUpThree(String formno){
        this.formno = formno;
        setLayout(null);

        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280, 40, 400, 40);
        add(l1);
        
        JLabel type = new JLabel("Account Type :");
        type.setFont(new Font("Raleway", Font.BOLD, 20));
        type.setBounds(100,140 ,200,30);
        add(type);
        //Radio Button for accounts

        r1 = new JRadioButton("Savings Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.LIGHT_GRAY);
        r1.setBounds(100,180,250,20);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(Color.LIGHT_GRAY);
        r2.setBounds(400,180,300,20);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(Color.LIGHT_GRAY);
        r3.setBounds(100,220,250,20);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(Color.LIGHT_GRAY);
        r4.setBounds(400,220,300,20);
        add(r4);

        //Button Group
        ButtonGroup accountType = new ButtonGroup();
        accountType.add(r1);
        accountType.add(r2);
        accountType.add(r3);
        accountType.add(r4);

        JLabel card = new JLabel("Card Number:");
        card.setFont(new Font("Raleway",Font.BOLD, 20));
        card.setBounds(100,300,200,30);
        add(card);

        JLabel cardDetail = new JLabel("Your 16 digit card number");
        cardDetail.setFont(new Font("Raleway",Font.BOLD, 12));
        cardDetail.setBounds(100,320,300,30);
        add(cardDetail);
        
        JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("Raleway", Font.BOLD, 20));
        number.setBounds(330,300,300,30);
        add(number);

        JLabel pin = new JLabel("Pin Number:");
        pin.setFont(new Font("Raleway",Font.BOLD, 20));
        pin.setBounds(100,370,200,30);
        add(pin);

        JLabel pinDetail = new JLabel("Your 4 digit password");
        pinDetail.setFont(new Font("Raleway",Font.BOLD, 12));
        pinDetail.setBounds(100,390,300,30);
        add(pinDetail);
        
        JLabel pinNumber = new JLabel("XXXX");
        pinNumber.setFont(new Font("Raleway", Font.BOLD, 20));
        pinNumber.setBounds(330,370,300,30);
        add(pinNumber);

        JLabel services = new JLabel("Services Required:");
        services.setFont(new Font("Raleway",Font.BOLD, 20));
        services.setBounds(100,450,300,30);
        add(services);

        c1 = new JCheckBox("ATM Card");
        c1.setBackground(Color.LIGHT_GRAY);
        c1.setFont(new Font("Raleway",Font.BOLD, 16));
        c1.setBounds(100, 490, 200, 30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.LIGHT_GRAY);
        c2.setFont(new Font("Raleway",Font.BOLD, 16));
        c2.setBounds(400, 490, 200, 30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.LIGHT_GRAY);
        c3.setFont(new Font("Raleway",Font.BOLD, 16));
        c3.setBounds(100, 530, 200, 30);
        add(c3);

        c4 = new JCheckBox("Email Alerts");
        c4.setBackground(Color.LIGHT_GRAY);
        c4.setFont(new Font("Raleway",Font.BOLD, 16));
        c4.setBounds(400, 530, 200, 30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.LIGHT_GRAY);
        c5.setFont(new Font("Raleway",Font.BOLD, 16));
        c5.setBounds(100, 570, 200, 30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.LIGHT_GRAY);
        c6.setFont(new Font("Raleway",Font.BOLD, 16));
        c6.setBounds(400, 570, 200, 30);
        add(c6);

        c7 = new JCheckBox("I hereby declare that the above enetered details are correct to the best of my knowledge");
        c7.setBackground(Color.LIGHT_GRAY);
        c7.setFont(new Font("Raleway",Font.BOLD, 12));
        c7.setBounds(100, 600, 600, 30);
        add(c7);

        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBounds(220, 700, 100, 30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(420, 700, 100, 30);
        cancel.addActionListener(this);
        add(cancel);
        

        getContentPane().setBackground(Color.LIGHT_GRAY);
        setSize(850,820);
        setLocation(350, 10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() ==submit){
            String accountType = null;
            if(r1.isSelected()){
                accountType = "Savings Account";
            }
            if(r2.isSelected()){
                accountType = "Fixed Deposit Account";
            }
            if(r3.isSelected()){
                accountType = "Current Account";
            }
            if(r4.isSelected()){
                accountType = "Recurring Deposit Account";
            }

            Random random = new Random();
            String cardNumber ="" +  Math.abs((random.nextLong()%9000000L) + 5040936000000000L);
            String pinNumber = "" + Math.abs((random.nextLong()%9000L) + 1000L);
            String facility = "";
            if(c1.isSelected()){
                facility = facility + " ATM Card";
            }
            else if(c2.isSelected()){
                facility = facility + " Internet Banking";
            }
            else if(c3.isSelected()){
                facility = facility + " Mobile Banking";
            }
            else if(c4.isSelected()){
                facility = facility + " Email Alerts";
            }
            else if(c5.isSelected()){
                facility = facility + " Cheque Book";
            }
            else if(c6.isSelected()){
                facility = facility + " E-Statement";
            }

            try{
                if(accountType.equals("")){
                    JOptionPane.showMessageDialog(null,"Account Type is Required");
                }
                else if(!c7.isSelected()){
                    JOptionPane.showMessageDialog(null, "Please click the declaration checkbox");
                }
                else{
                    Conn conn = new Conn();
                    String query1 = "insert into signupthree values('" + formno  + "', '" + accountType  + "', '" + cardNumber  + "', '" + pinNumber  + "', '" + facility  + "')";
                    String query2 = "insert into login values('" + formno  + "','" + cardNumber  + "', '" + pinNumber  + "')";
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null,"Card Number : " + cardNumber + "\n Pin: " + pinNumber);
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }
        else if(ae.getSource() == cancel){

        }
    }
    public static void main(String[] args) {
        new SignUpThree ("");
    }
}
