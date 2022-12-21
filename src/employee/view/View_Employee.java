
package employee;

/**
 *
 * @author User
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class View_Employee implements ActionListener{

    JFrame frame;
    JTextField t;
    JLabel l1,l2;
    JButton b,b2;

    View_Employee(){
        Color back = new Color(37, 54, 64);
        Color red = new Color(255, 111,114);
        Color cyan = new Color(23, 187,159);
        Color grey = new Color(145, 159,170);
        Color blue = new Color(101, 169,252);
        Color yellow = new Color(203, 163, 48);

        frame=new JFrame("View");
        frame.setBackground(Color.green);
        frame.setLayout(null);

        l1=new JLabel();
        l1.setBounds(0,0,500,270);
        l1.setLayout(null);
        


        l2=new JLabel("Employee Id");
        l2.setVisible(true);
        l2.setBounds(40,60,250,30);
        l2.setForeground(cyan);
        Font F1 = new Font("Arial",Font.BOLD,30);
        l2.setFont(F1); 
        l1.add(l2);
        frame.add(l1);


        t=new JTextField();
        t.setBounds(240,60,220,30);
        t.setBackground(grey);
        l1.add(t);

        b=new JButton("Search");
        b.setBounds(240,150,100,30);
        b.addActionListener(this);
        b.setBackground(blue);
        b.setForeground(Color.BLACK);
        l1.add(b);

        b2=new JButton("Back");
        b2.setBounds(360,150,100,30);
        b2.addActionListener(this);
        b2.setBackground(red);
        b2.setForeground(Color.BLACK);
        l1.add(b2);

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
            frame.setVisible(false);
            dataTable p=new dataTable(t.getText());
        }
       

    }

    public static void main(String[]args){
        View_Employee v=new View_Employee();
    }
}
