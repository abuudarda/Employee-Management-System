
package employee;

import java.awt.*;
import javax.swing.*;
import java.lang.Thread;
import java.awt.event.*;
import java.sql.*;

class login  implements ActionListener{

    JFrame frame;
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;

    login(){
        Color back = new Color(37, 54, 64);
        Color butt1 = new Color(255, 111,114);
        Color butt2 = new Color(101, 169,252);
        
        frame=new JFrame("Admin Login");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("employee/Images/sigma.jpg"));
        Image i2 = i1.getImage().getScaledInstance(150,250,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(350,20,150,250);
        frame.add(l3);


        frame.setBackground(back);
        frame.setLayout(null);

        l1 = new JLabel("Username");
        l1.setBounds(40,20,100,30);
        l1.setForeground(Color.WHITE);
        frame.add(l1);
        
        l2 = new JLabel("Password");
        l2.setBounds(40,70,100,30);
        l2.setForeground(Color.WHITE);

        frame.add(l2);
 
        t1=new JTextField();
        t1.setBounds(150,20,150,30);
        frame.add(t1);

        t2=new JPasswordField();
        t2.setBounds(150,70,150,30);
        frame.add(t2);
        
        
        b1 = new JButton("Login");
        b1.setBounds(40,140,120,50);
        b1.setFont(new Font("Arial",Font.BOLD,15));
        b1.addActionListener(this);
        b1.setBackground(butt2);
        b1.setForeground(Color.BLACK);
        frame.add(b1);

        b2=new JButton("Cancel");
        b2.setBounds(180,140,120,50);
        b2.setFont(new Font("Arial",Font.BOLD,15));
        b2.setBackground(butt1);
        b2.setForeground(Color.BLACK);
        frame.add(b2);

        b2.addActionListener(this);
        
        frame.getContentPane().setBackground(back);
        frame.getContentPane().setForeground(Color.WHITE);

        frame.setVisible(true);
        frame.setSize(600,300);
        frame.setLocation(400,300);

    }
    
 public void actionPerformed(ActionEvent ae){

        try{
            connector c = new connector();
            String user = t1.getText();
            String pass = t2.getText ();
            
            String q = "select * from login where username='"+user+"' and password='"+pass+"'";
            
            ResultSet rs = c.s.executeQuery(q); 
            if(rs.next()){
                new AdminHome().frame.setVisible(true);
                frame.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Invalid login");
                frame.setVisible(false);
            }
        }catch(Exception err){
            err.printStackTrace();
        }
    }
    public static void main(String[] arg){
        login l=new login();
    }
}

