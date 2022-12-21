package employee;

import java.awt.*;
import javax.swing.*;

//import employee.controller.attandanceSheet;

import java.awt.event.*;

class AdminHome  implements ActionListener{

    JFrame frame;
    JLabel l1,l2;
    JButton b1,b2,b3,b4,b5;

    AdminHome(){

        Color back = new Color(37, 54, 64);
        Color red = new Color(255, 111,114);
        Color cyan = new Color(23, 187,159);
        Color grey = new Color(145, 159,170);
        Color blue = new Color(101, 169,252);
        Color yellow = new Color(203, 163, 48);

        frame=new JFrame("Admin Home");
        frame.setBackground(back);
        frame.setLayout(null);

        l1 = new JLabel();
        l1.setBounds(0,0,800,500);
        l1.setLayout(null);
        // ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("employee/Images/e.jpg"));
        // l1.setIcon(i1);
        frame.add(l1);

        l2 = new JLabel("ADMIN");
        l2.setBounds(250,20,300,50);
        l2.setFont(new Font("Arial",Font.BOLD,50));
        l2.setForeground(Color.WHITE);
        l1.add(l2);

        b1=new JButton("Add new Employee");
        b1.setBounds(50,100,200,80);
        b1.setFont(new Font("Arial",Font.BOLD,15));
        b1.setBackground(blue);
        b1.setForeground(Color.BLACK);
        b1.addActionListener(this);
        l1.add(b1);


        b2=new JButton("Search Employee");
        b2.setBounds(350,100,200,80);
        b2.setFont(new Font("Arial",Font.BOLD,15));
        b2.setBackground(cyan);
        b2.setForeground(Color.BLACK);
        b2.addActionListener(this);
        l1.add(b2);

        b3=new JButton("Remove Employee");
        b3.setBounds(50,200,200,80);
        b3.setFont(new Font("Arial",Font.BOLD,15));
        b3.setBackground(red);
        b3.setForeground(Color.BLACK);
        b3.addActionListener(this);
        l1.add(b3);

        b4=new JButton("Update Employee Data");
        b4.setBounds(350,200,200,80);
        b4.setFont(new Font("Arial",Font.BOLD,15));
        b4.setBackground(grey);
        b4.setForeground(Color.BLACK);
        b4.addActionListener(this);
        l1.add(b4);

        b5=new JButton("Attendance Sheet");
        b5.setBounds(350,300,200,80);
        b5.setFont(new Font("Arial",Font.BOLD,15));
        b5.setBackground(yellow);
        b5.setForeground(Color.BLACK);
        b5.addActionListener(this);
        l1.add(b5);

        frame.getContentPane().setBackground(back);
        frame.getContentPane().setForeground(Color.WHITE);
        frame.setVisible(true);
        frame.setSize(700,500);
        frame.setLocation(450,200);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            frame.setVisible(false);
            new Add_Employee();
        }
        if(ae.getSource()==b2){
            frame.setVisible(false);
            new View_Employee();
        }
        if(ae.getSource()==b3){
            frame.setVisible(false);
            new Remove_Employee();
        }
        if(ae.getSource()==b4){
            frame.setVisible(false);
            new Search_Employee();
        }
        if(ae.getSource()==b5){
            frame.setVisible(false);
            new attandanceSheet();
        }
    }

    public static void main(String[ ] arg){
        AdminHome z = new AdminHome();
    }
}

