package LW_08;

import javax.swing.*;
import java.awt.*;

class RegistrationForm extends JFrame {

    private static final int fHeight = 600;
    private static final int fWidth = 400;
    private static final int fX = 300;
    private static final int fY = 300;

    private int index = 0;

    private String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };



//    private final String[] date = {"1","2",}

    public RegistrationForm (){
        setTitle("Registration Form");
        setBounds(fX,fY,fWidth,fHeight);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container cont = getContentPane();
        cont.setLayout(null);

        JLabel signUp = new JLabel("Sign Up");
        signUp.setFont(new Font("Arial",Font.BOLD,20));
        signUp.setLocation(150,20);
        signUp.setSize(100,30);
        signUp.setForeground(Color.BLUE);
        cont.add(signUp);

        JLabel name = new JLabel("Name");
        name.setSize(100,30);
        name.setLocation(20,80);
        name.setFont(new Font("Arial",Font.BOLD,15));
        cont.add(name);

        JTextField nameText = new JTextField();
        nameText.setLocation(130,80);
        nameText.setSize(200,30);
        cont.add(nameText);

        JLabel mail = new JLabel("Email");
        mail.setSize(100,30);
        mail.setLocation(20,120);
        mail.setFont(new Font("Arial",Font.BOLD,15));
        cont.add(mail);

        JTextField emailText = new JTextField();
        emailText.setLocation(130,120);
        emailText.setSize(200,30);
        cont.add(emailText);

        JLabel gender = new JLabel("Gender");
        gender.setSize(100,30);
        gender.setLocation(20,160);
        gender.setFont(new Font("Arial",Font.BOLD,15));
        cont.add(gender);

        JRadioButton male = new JRadioButton("Male");
        male.setLocation(130,160);
        male.setSelected(true);
        male.setSize(80,30);
        male.setFont(new Font("Arial",Font.BOLD,15));
        add(male);

        JRadioButton female = new JRadioButton("Female");
        female.setLocation(220,160);
        female.setSize(100,30);
        female.setFont(new Font("Arial",Font.BOLD,15));
        add(female);

        ButtonGroup genderButton = new ButtonGroup();
        genderButton.add(male);
        genderButton.add(female);

        JLabel birthday = new JLabel("Birthday");
        birthday.setFont(new Font("Arial",Font.BOLD,15));
        birthday.setLocation(20,200);
        birthday.setSize(100,30);
        cont.add(birthday);

        String[] days = new String[31];
        for (int i = 0; i < 31; i++) {
            days[i] = String.valueOf(i + 1);
        }
        JComboBox date = new JComboBox<>(days);

        date.setLocation(130,200);
        date.setSize(50,20);
        cont.add(date);

        JComboBox month = new JComboBox<>(months);
        month.setLocation(180,200);
        month.setSize(100,20);
        month.setFont(new Font("Arial",Font.BOLD,15));
        cont.add(month);

        String[] years = new String[2026-1990+1];
        for (int i = 1990; i <= 2026; i++) {
            years[index] = String.valueOf(i);
            index++;
        }
        JComboBox year = new JComboBox<>(years);
        year.setLocation(280,200);
        year.setSize(60,20);
        cont.add(year);

        JLabel password = new JLabel("Password");
        password.setSize(100,30);
        password.setLocation(20,240);
        password.setFont(new Font("Arial",Font.BOLD,15));
        cont.add(password);

        JTextField passwordText = new JTextField();
        passwordText.setLocation(130,240);
        passwordText.setSize(200,30);
        cont.add(passwordText);

        JCheckBox checkBox = new JCheckBox("I am not a robot");
        checkBox.setLocation(20,290);
        checkBox.setSize(300,30);
        cont.add(checkBox);

        JButton signUpButton = new JButton("Sign Up");
        signUpButton.setLocation(20,330);
        signUpButton.setSize(340,25);
        signUpButton.setForeground(Color.WHITE);
        signUpButton.setBackground(Color.BLUE);
        signUpButton.setFont(new Font("Arial",Font.BOLD,15));
        cont.add(signUpButton);

        JLabel signIn = new JLabel("Sign In");
        signIn.setFont(new Font("Arial",Font.BOLD,20));
        signIn.setLocation(150,370);
        signIn.setSize(100,30);
        signIn.setForeground(Color.BLUE);
        cont.add(signIn);

        JLabel SignInMail = new JLabel("Email");
        SignInMail.setSize(100,30);
        SignInMail.setLocation(20,410);
        SignInMail.setFont(new Font("Arial",Font.BOLD,15));
        cont.add(SignInMail);

        JTextField signInEmailText = new JTextField();
        signInEmailText.setLocation(130,410);
        signInEmailText.setSize(200,30);
        cont.add(signInEmailText);

        JLabel signInPassword = new JLabel("Password");
        signInPassword.setSize(100,30);
        signInPassword.setLocation(20,450);
        signInPassword.setFont(new Font("Arial",Font.BOLD,15));
        cont.add(signInPassword);

        JTextField signInPasswordText = new JTextField();
        signInPasswordText.setLocation(130,450);
        signInPasswordText.setSize(200,30);
        cont.add(signInPasswordText);

        JButton signInButton = new JButton("Sign In");
        signInButton.setLocation(20,490);
        signInButton.setSize(340,25);
        signInButton.setForeground(Color.WHITE);
        signInButton.setBackground(Color.BLUE);
        signInButton.setFont(new Font("Arial",Font.BOLD,15));
        cont.add(signInButton);




    }

}
