package hospital.management.system;

import javax.swing.*;
import java.awt.*;


public class newPatient extends JFrame {


    JComboBox comboBox;

    JTextField textFieldNumber, textName, textFieldCountry, textDeposite;

    JRadioButton r1, r2;

    Choice c1;

    JLabel date;

    JButton b1, b2;


    newPatient() {

        JPanel panel = new JPanel();
        setBounds(5,5, 840, 540);
        setBackground(new Color(90, 156,163 ));
        setLayout(null);
        add(panel);


        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/patient.png"));
        Image image = imageIcon.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(550, 150, 200, 200);
        panel.add(label);

        JLabel labelName = new JLabel("NEW PATIENT FORM");
        labelName.setBounds(118, 11, 260, 53);
        labelName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(labelName);

        JLabel labelID = new JLabel("ID :");
        labelID.setBounds(35, 76, 200, 14);
        labelID.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        labelID.setForeground(Color.WHITE);
        panel.add(labelID);

        setSize(850, 550);
        setLayout(null);
        setLocation(300, 250);
        setVisible(true);


    }

    public static void main(String[] args) {

        new newPatient();
    }
}
