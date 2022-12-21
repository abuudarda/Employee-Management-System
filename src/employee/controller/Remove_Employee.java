
package employee;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Remove_Employee implements ActionListener{
    JFrame frame;
    JTextField t;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    JButton b,b1,b2,b3;

    Remove_Employee(){
        Color back = new Color(37, 54, 64);
        Color red = new Color(255, 111,114);
        Color cyan = new Color(23, 187,159);
        Color grey = new Color(145, 159,170);
        Color blue = new Color(101, 169,252);
        Color yellow = new Color(203, 163, 48);

        frame=new JFrame("Remove Employee");
        frame.setBackground(red);   
        frame.setLayout(null);

        l5=new JLabel();
        l5.setBounds(0,0,500,500);
        l5.setLayout(null);
        frame.add(l5);

        
        l1=new JLabel("Employee Id");
        l1.setBounds(50,50,250,30);
        l1.setForeground(cyan);
        Font f2 = new Font("Arial",Font.BOLD,25); 
        l1.setFont(f2);
        l5.add(l1);

        t=new JTextField();
        t.setBounds(250,50,150,30);
        t.setBackground(grey);
        l5.add(t);


        b=new JButton("Search");
        b.setBounds(200,100,100,30);
        b.addActionListener(this);
        b.setBackground(red);
        b.setForeground(Color.BLACK);
        l5.add(b);

        b3=new JButton("Back");
        b3.setBounds(360,100,100,30);   
        b3.addActionListener(this);
        b3.setBackground(grey);
        b3.setForeground(Color.BLACK);
        l5.add(b3);


        frame.getContentPane().setBackground(back);
        frame.getContentPane().setForeground(Color.WHITE);

        frame.setSize(500,500);
        frame.setLocation(500,250);  
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b){
            try{
                connector con = new connector();
                String str = "DELETE FROM `employee` WHERE emp_id=\""+t.getText()+"\"";
                System.out.println(str);
                con.s.executeUpdate(str);

                
                JOptionPane.showMessageDialog(null,"DELETED!");
            }catch(Exception ex){
                System.out.println(ex);
            }
        }
        
        if(ae.getSource()==b2){
            frame.setVisible(false);
            AdminHome d=new AdminHome();
        }
        if(ae.getSource()==b3){
            frame.setVisible(false);
            AdminHome d=new AdminHome();
        }
    }

    public static void main(String[]ar){
        new Remove_Employee();
    }
}