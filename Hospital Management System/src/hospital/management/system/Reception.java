package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {

    Reception() {

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(5, 160, 1525, 670);
        panel.setBackground(new Color(109, 164, 170));
        add(panel);


        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5, 5, 1525, 150);
        panel1.setBackground(new Color(109, 164, 170));
        add(panel1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/amb.png"));
        Image image = i1.getImage().getScaledInstance(200, 100, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(image);
        JLabel label = new JLabel(i2);
        label.setBounds(1100, 0, 300, 100);
        panel1.add(label);


        JButton btn1 = new JButton("Add New Patient");
        btn1.setBounds(30, 15, 200, 50);
        btn1.setBackground(new Color(246, 215, 118));
        panel1.add(btn1);
        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new Login();

            }
        });


        JButton btn2 = new JButton("Room");
        btn2.setBounds(30, 75, 200, 50);
        btn2.setBackground(new Color(246, 215, 118));
        panel1.add(btn2);
        btn2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JButton btn3 = new JButton("Department");
        btn3.setBounds(270, 15, 200, 50);
        btn3.setBackground(new Color(246, 215, 118));
        panel1.add(btn3);
        btn3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JButton btn4 = new JButton("Employee Information");
        btn4.setBounds(270, 75, 200, 50);
        btn4.setBackground(new Color(246, 215, 118));
        panel1.add(btn4);
        btn4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JButton btn5 = new JButton("Patient Information");
        btn5.setBounds(510, 15, 200, 50);
        btn5.setBackground(new Color(246, 215, 118));
        panel1.add(btn5);
        btn5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        JButton btn6 = new JButton("Patient Discharge");
        btn6.setBounds(510, 75, 200, 50);
        btn6.setBackground(new Color(246, 215, 118));
        panel1.add(btn6);
        btn6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });



        JButton btn7 = new JButton("Update Patient Details");
        btn7.setBounds(750, 15, 200, 50);
        btn7.setBackground(new Color(246, 215, 118));
        panel1.add(btn7);
        btn7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });



        JButton btn8 = new JButton("Search Patient");
        btn8.setBounds(750, 75, 200, 50);
        btn8.setBackground(new Color(246, 215, 118));
        panel1.add(btn8);
        btn8.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        JButton btn9 = new JButton("Logout");
        btn9.setBounds(990, 58, 150, 50);
        btn9.setBackground(new Color(246, 215, 118));
        panel1.add(btn9);
        btn9.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });



        setSize(1950,1020);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Reception();
    }
}


