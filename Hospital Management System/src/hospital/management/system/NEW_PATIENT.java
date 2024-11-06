package hospital.management.system;

import javax.swing.*;
import java.awt.*;

public class NEW_PATIENT extends JFrame {


    JComboBox comboBox;

    JTextField textFieldNumber, textName, textFieldCountry, textDeposite;

    JRadioButton r1, r2;

    Choice c1;

    JLabel date;

    JButton b1, b2;


    NEW_PATIENT(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5, 840, 540);
        panel.setBackground(new Color(90, 156,163 ));
        panel.setLayout(null);
        add(panel);














        panel.setSize(850, 550);
        panel.setLayout(null);
        panel.setLocation(300, 250);
        setVisible(true);





    }









    public static void main(String[] args) {
        new NEW_PATIENT();

    }
}
