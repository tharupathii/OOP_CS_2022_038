package LW_08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

class RegistrationForm extends JFrame implements ActionListener {

    private static final int fHeight = 600;
    private static final int fWidth = 400;
    private static final int fX = 300;
    private static final int fY = 300;

    private JButton signInButton , signUpButton;
    private JCheckBox checkBox;
    private JLabel name,mail,gender,birthday,password;
    private JRadioButton male,female;
    private JComboBox date,month,year;
    private JTextField nameText,emailText,signInEmailText;
    private JPasswordField passwordText,signInPasswordText;
    DBConnector dbConnector;

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

        name = new JLabel("Name");
        name.setSize(100,30);
        name.setLocation(20,80);
        name.setFont(new Font("Arial",Font.BOLD,15));
        cont.add(name);

        nameText = new JTextField();
        nameText.setLocation(130,80);
        nameText.setSize(200,30);
        cont.add(nameText);

        mail = new JLabel("Email");
        mail.setSize(100,30);
        mail.setLocation(20,120);
        mail.setFont(new Font("Arial",Font.BOLD,15));
        cont.add(mail);

        emailText = new JTextField();
        emailText.setLocation(130,120);
        emailText.setSize(200,30);
        cont.add(emailText);

        gender = new JLabel("Gender");
        gender.setSize(100,30);
        gender.setLocation(20,160);
        gender.setFont(new Font("Arial",Font.BOLD,15));
        cont.add(gender);

        male = new JRadioButton("Male");
        male.setLocation(130,160);
        male.setSelected(true);
        male.setSize(80,30);
        male.setFont(new Font("Arial",Font.BOLD,15));
        add(male);

        female = new JRadioButton("Female");
        female.setLocation(220,160);
        female.setSize(100,30);
        female.setFont(new Font("Arial",Font.BOLD,15));
        add(female);

        ButtonGroup genderButton = new ButtonGroup();
        genderButton.add(male);
        genderButton.add(female);

        birthday = new JLabel("Birthday");
        birthday.setFont(new Font("Arial",Font.BOLD,15));
        birthday.setLocation(20,200);
        birthday.setSize(100,30);
        cont.add(birthday);

        String[] days = new String[31];
        for (int i = 0; i < 31; i++) {
            days[i] = String.valueOf(i + 1);
        }
        date = new JComboBox<>(days);

        date.setLocation(130,200);
        date.setSize(50,20);
        cont.add(date);

        month = new JComboBox<>(months);
        month.setLocation(180,200);
        month.setSize(100,20);
        month.setFont(new Font("Arial",Font.BOLD,15));
        cont.add(month);

        String[] years = new String[2026-1990+1];
        for (int i = 1990; i <= 2026; i++) {
            years[index] = String.valueOf(i);
            index++;
        }
        year = new JComboBox<>(years);
        year.setLocation(280,200);
        year.setSize(60,20);
        cont.add(year);

        password = new JLabel("Password");
        password.setSize(100,30);
        password.setLocation(20,240);
        password.setFont(new Font("Arial",Font.BOLD,15));
        cont.add(password);

        passwordText = new JPasswordField();
        passwordText.setLocation(130,240);
        passwordText.setSize(200,30);
        cont.add(passwordText);

        checkBox = new JCheckBox("I am not a robot");
        checkBox.setLocation(20,290);
        checkBox.setSize(300,30);
        cont.add(checkBox);

        signUpButton = new JButton("Sign Up");
        signUpButton.setLocation(20,330);
        signUpButton.setSize(340,25);
        signUpButton.setForeground(Color.WHITE);
        signUpButton.setBackground(Color.BLUE);
        signUpButton.setFont(new Font("Arial",Font.BOLD,15));
        signUpButton.addActionListener(this);
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

        signInEmailText = new JTextField();
        signInEmailText.setLocation(130,410);
        signInEmailText.setSize(200,30);
        cont.add(signInEmailText);

        JLabel signInPassword = new JLabel("Password");
        signInPassword.setSize(100,30);
        signInPassword.setLocation(20,450);
        signInPassword.setFont(new Font("Arial",Font.BOLD,15));
        cont.add(signInPassword);

        signInPasswordText = new JPasswordField();
        signInPasswordText.setLocation(130,450);
        signInPasswordText.setSize(200,30);
        cont.add(signInPasswordText);

        signInButton = new JButton("Sign In");
        signInButton.setLocation(20,490);
        signInButton.setSize(340,25);
        signInButton.setForeground(Color.WHITE);
        signInButton.setBackground(Color.BLUE);
        signInButton.setFont(new Font("Arial",Font.BOLD,15));
        signInButton.addActionListener(this);
        cont.add(signInButton);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == signUpButton){
            //check checkbox
            if (checkBox.isSelected()){
                //add to database
                //System.out.println("adding data to database");
                dbConnector = new DBConnector();
                String nameq = nameText.getText();
                String emailq = emailText.getText();
                String genderq = male.isSelected() ? "Male" : "Female";
                String dobq =  date.getSelectedItem() + "/" + month.getSelectedItem() + "/" + year.getSelectedItem();
                String passwordq = passwordText.getText();
                try{
                    dbConnector.addData(nameq,emailq,genderq,dobq,passwordq);
                    nameText.setText("");
                    emailText.setText("");
                    male.setSelected(false);
                    female.setSelected(false);
                    date.setSelectedIndex(0);
                    month.setSelectedIndex(0);
                    year.setSelectedIndex(0);
                    passwordText.setText("");
                    checkBox.setSelected(false);
                }catch (SQLException ex){
                    throw new RuntimeException(ex);
                }
            }else {

                JOptionPane.showMessageDialog(this, "pls conform that you are not a robot. ");
            }
            //ask user to tick

        } else if (e.getSource() == signInButton) {

            //get from database
            String email = signInEmailText.getText();
            String password = signInPasswordText.getText();
            try {
                if(dbConnector.getData(email,password)){
                    JOptionPane.showMessageDialog(this,"Sign in success");
                }else {
                    JOptionPane.showMessageDialog(this,"Sign in unsuccess!");
                }
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }

    }
}
