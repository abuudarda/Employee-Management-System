
package employee;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



class Search_Employee implements ActionListener{
    JFrame frame;
    JTextField t;
    JLabel l,l5;
    JButton b,b2;

    Search_Employee(){
        Color back = new Color(37, 54, 64);
        Color red = new Color(255, 111,114);
        Color cyan = new Color(23, 187,159);
        Color grey = new Color(145, 159,170);
        Color blue = new Color(101, 169,252);
        Color yellow = new Color(203, 163, 48);

        frame=new JFrame("search");
        frame.setBackground(Color.green);
        frame.setLayout(null);

        l5=new JLabel();
        l5.setBounds(0,0,500,270);
        l5.setLayout(null);


        l=new JLabel("Employee Id");
        l.setVisible(true);
        l.setBounds(40,50,250,30);
        l.setForeground(cyan);
        Font F1=new Font("Arial",Font.BOLD,25);
        l.setFont(F1); 
        l5.add(l);
        frame.add(l5);

        t=new JTextField();
        t.setBounds(240,50,220,30);
        t.setBackground(grey);
        l5.add(t);

        b=new JButton("Search");
        b.setBounds(240,150,100,30);
        b.addActionListener(this);
        b.setBackground(blue);
        b.setForeground(Color.BLACK);
        l5.add(b);


        b2=new JButton("Back");
        b2.setBounds(360,150,100,30);
        b2.addActionListener(this);
        b2.setBackground(red);
        b2.setForeground(Color.BLACK);
        l5.add(b2);

        frame.getContentPane().setBackground(back);
        frame.getContentPane().setForeground(Color.WHITE);

        frame.setSize(500,270);
        frame.setLocation(450,250);
        frame.setVisible(true);
    }

    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b2){
            frame.setVisible(false);
            AdminHome d=new AdminHome();
        }
        if(ae.getSource()==b){
            Update_Employee update_Employee = new Update_Employee(t.getText());
            frame.setVisible(false);
        }

    }
    
    public static void main(String[]ar){
        Search_Employee search_Employee = new Search_Employee();
    } 	
}
