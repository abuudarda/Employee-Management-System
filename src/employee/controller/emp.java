
package employee;

/**
 *
 * @author User
 */
import java.awt.*;
import javax.swing.*;
import java.lang.Thread;
import java.awt.event.*;
import java.sql.*;

class emp  implements ActionListener{

    JFrame frame;
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;

    emp(){
        Color back = new Color(37, 54, 64);
        Color butt1 = new Color(255, 111,114);
        Color butt2 = new Color(101, 169,252);
        Color red = new Color(255, 111,114);
        Color cyan = new Color(23, 187,159);
        Color grey = new Color(145, 159,170);
        Color blue = new Color(101, 169,252);
        Color yellow = new Color(203, 163, 48);
        
        frame=new JFrame("Employee Login");

        frame.setBackground(back);
        frame.setLayout(null);

        l1 = new JLabel("ID");
        l1.setBounds(40,20,100,30);
        frame.add(l1);
        
        l2 = new JLabel("Password");
        l2.setBounds(40,70,100,30);
        frame.add(l2);
 
        t1=new JTextField();
        t1.setBounds(150,20,150,30);
        frame.add(t1);

        t2=new JPasswordField();
        t2.setBounds(150,70,150,30);
        frame.add(t2);
        
        // ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("employee/Images/user.png"));
        // Image i2 = i1.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        // ImageIcon i3 =  new ImageIcon(i2);
        // JLabel l3 = new JLabel(i3);
        // l3.setBounds(350,20,150,150);
        // frame.add(l3);


        b1 = new JButton("Login");
        b1.setBounds(40,140,120,30);
        b1.setFont(new Font("Arial",Font.BOLD,15));
        b1.addActionListener(this);
        b1.setBackground(butt2);
        b1.setForeground(Color.BLACK);
        frame.add(b1);

        b2=new JButton("Cancel");
        b2.setBounds(180,140,120,30);
        b2.setFont(new Font("Arial",Font.BOLD,15));
        b2.setBackground(butt1);
        b2.setForeground(Color.black);
        frame.add(b2);

        b2.addActionListener(this);
        
        frame.getContentPane().setBackground(back);

        
        frame.getContentPane().setBackground(Color.WHITE);

        frame.setVisible(true);
        frame.setSize(600,300);
        frame.setLocation(400,300);

    }
    
 public void actionPerformed(ActionEvent ae){

        try{
            connector c1 = new connector();
            String u = t1.getText();
            String v = t2.getText ();
            
            String q = "select * from employee where emp_id='"+u+"' and password='"+v+"'";
            
            ResultSet rs = c1.s.executeQuery(q); 
            if(rs.next()){
                new empHome(u).frame.setVisible(true);
                frame.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Invalid login");
                frame.setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] arg){
        emp l=new emp();
    }
}

