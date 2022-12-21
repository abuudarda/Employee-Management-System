
package employee;

import java.awt.*;
import javax.swing.*;
import java.lang.Thread;
import java.awt.event.*;

class Front_Page implements ActionListener{
    JFrame frame; 
    JLabel id,l1;
    JButton adminButton,empButton;

    Front_Page(){
 
        frame=new JFrame("Employee Management System");
        frame.setBackground(Color.CYAN);
        frame.setLayout(null);
        
        // ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("employee/Images/home.jpg"));
        // Image i2 = i1.getImage().getScaledInstance(1500,1000,Image.SCALE_DEFAULT);
        // ImageIcon i3 = new ImageIcon(i2);
        // JLabel l1 = new JLabel(i3);
        
        // l1.setBounds(0,170,1360,530);
        // frame.add(l1);
        Color back = new Color(37, 54, 64);
        Color butt1 = new Color(255, 111,114);
        Color butt2 = new Color(101, 169,252);
        id=new JLabel();
        id.setBounds(0,0,1360,750);
        id.setLayout(null);
        
        adminButton = new JButton("Admin");
        adminButton.setBackground(butt1);
        adminButton.setForeground(Color.BLACK);
        adminButton.setBounds(220,560,300,70);
        adminButton.addActionListener(this);
        id.add(adminButton);

        empButton = new JButton("Employee");
        empButton.setBackground(butt2);
        empButton.setForeground(Color.BLACK);
        empButton.setBounds(620,560,300,70);
        empButton.addActionListener(this);
        id.add(empButton);

   

        JLabel lid=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        lid.setBounds(80,30,1500,100);
        lid.setFont(new Font("Arial",Font.PLAIN,71));
        lid.setForeground(Color.CYAN);
        id.add(lid);

        frame.add(id);
        
        
        frame.getContentPane().setBackground(back);

        frame.setVisible(true);
        frame.setSize(1360,750);
        frame.setLocation(200,100);

        // while(true){
        //     lid.setVisible(false); 
        //     try{
        //         Thread.sleep(1500);
        //     }catch(Exception e){} 
        //     lid.setVisible(true);
        //     try{
        //         Thread.sleep(1500);
        //     }catch(Exception e){}
        // }

    }
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==adminButton){
            frame.setVisible(false);
            new login();    
        }
        else if(ae.getSource()==empButton){
            frame.setVisible(false);
            new emp();    
        } 
    }


    public static void main(String[] arg){
        Front_Page f = new Front_Page();
    }
}

