
package employee;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Add_Employee implements ActionListener{

    JFrame frame;
    JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id15,id16;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;
    JButton b,b1;

    Add_Employee(int i){}
    
    Add_Employee(){
        Color back = new Color(37, 54, 64);
        Color red = new Color(255, 111,114);
        Color cyan = new Color(23, 187,159);
        Color grey = new Color(145, 159,170);
        Color blue = new Color(101, 169,252);
        Color yellow = new Color(203, 163, 48);

        frame = new JFrame("Add Employee");
        frame.setBackground(Color.white);
        frame.setLayout(null);

        id15=new JLabel();
        id15.setBounds(0,0,900,700);
        id15.setLayout(null);


        id8 = new JLabel("New Employee Form");
        id8.setBounds(320,30,500,50);
        id8.setFont(new Font("Arial",Font.BOLD,25));
        id8.setForeground(cyan);
        id15.add(id8);
        frame.add(id15);

 
        id1 = new JLabel("Name");
        id1.setBounds(50,150,100,30);
        id1.setFont(new Font("Arial",Font.BOLD,20));
        id1.setForeground(Color.white);
        id15.add(id1);

        t1=new JTextField();
        t1.setBounds(200,150,150,30);
        t1.setBackground(grey);
        id15.add(t1);

        id2 = new JLabel("Father's Name");
        id2.setBounds(400,150,200,30);
        id2.setFont(new Font("Arial",Font.BOLD,20));
        id2.setForeground(Color.white);
        id15.add(id2);

        t2=new JTextField();
        t2.setBounds(600,150,150,30);
        t2.setBackground(grey);
        id15.add(t2);

        id3= new JLabel("Age");
        id3.setBounds(50,200,100,30);
        id3.setFont(new Font("Arial",Font.BOLD,20));
        id3.setForeground(Color.white);
        id15.add(id3);

        t3=new JTextField();
        t3.setBounds(200,200,150,30);
        t3.setBackground(grey);
        id15.add(t3);

        id4= new JLabel("Date Of Birth");  
        id4.setBounds(400,200,200,30);
        id4.setFont(new Font("Arial",Font.BOLD,20));
        id4.setForeground(Color.white);
        id15.add(id4);

        t4=new JTextField();
        t4.setBounds(600,200,150,30);
        t4.setBackground(grey);
        id15.add(t4);

        id5= new JLabel("Address");
        id5.setBounds(50,250,100,30);
        id5.setFont(new Font("Arial",Font.BOLD,20));
        id5.setForeground(Color.white);
        id15.add(id5);

        t5=new JTextField();
        t5.setBounds(200,250,150,30);
        t5.setBackground(grey);
        id15.add(t5);

        id6= new JLabel("Phone");
        id6.setBounds(400,250,100,30);
        id6.setFont(new Font("Arial",Font.BOLD,20));
        id6.setForeground(Color.white);
        id15.add(id6);

        t6=new JTextField();
        t6.setBounds(600,250,150,30);
        t6.setBackground(grey);
        id15.add(t6);

        id7= new JLabel("Email");
        id7.setBounds(50,300,100,30);
        id7.setFont(new Font("Arial",Font.BOLD,20));
        id7.setForeground(Color.white);
        id15.add(id7);

        t7=new JTextField();
        t7.setBounds(200,300,150,30);
        t7.setBackground(grey);
        id15.add(t7);

        id9= new JLabel("Department");
        id9.setBounds(400,300,150,30);
        id9.setFont(new Font("Arial",Font.BOLD,20));
        id9.setForeground(Color.white);
        id15.add(id9);

        t8=new JTextField();
        t8.setBounds(600,300,150,30);
        t8.setBackground(grey);
        id15.add(t8);

        id10= new JLabel("Post");
        id10.setBounds(50,350,100,30);
        id10.setFont(new Font("Arial",Font.BOLD,20));
        id10.setForeground(Color.white);
        id15.add(id10);

        t9=new JTextField();
        t9.setBounds(200,350,150,30);
        t9.setBackground(grey);
        id15.add(t9);


        id11= new JLabel("Code");
        id11.setBounds(400,350,100,30);
        id11.setFont(new Font("Arial",Font.BOLD,20));
        id11.setForeground(Color.white);
        id15.add(id11);

        t10=new JTextField();
        t10.setBounds(600,350,150,30);
        t10.setBackground(grey);
        id15.add(t10);

        id12= new JLabel("Employee Id");
        id12.setBounds(50,400,150,30);
        id12.setFont(new Font("Arial",Font.BOLD,20));
        id12.setForeground(Color.white);
        id15.add(id12);

        t11=new JTextField();   
        t11.setBounds(200,400,150,30);
        t11.setBackground(grey);
        id15.add(t11);

        id16= new JLabel("Password");
        id16.setBounds(400,400,150,30);
        id16.setFont(new Font("Arial",Font.BOLD,20));
        id16.setForeground(Color.white);
        id15.add(id16);

        t12=new JTextField();   
        t12.setBounds(600,400,150,30);
        t12.setBackground(grey);
        id15.add(t12);

        b = new JButton("Submit");
        b.setBackground(blue);
        b.setForeground(Color.BLACK);
        b.setBounds(250,550,150,40);
        
        id15.add(b);

        b1=new JButton("Back");   
        b1.setBackground(red);
        b1.setForeground(Color.BLACK);
        b1.setBounds(450,550,150,40);
        
        id15.add(b1);
        
        b.addActionListener(this);
        b1.addActionListener(this);
    
        frame.getContentPane().setBackground(back);
        frame.getContentPane().setForeground(Color.WHITE);

        frame.setVisible(true);
        frame.setSize(900,700);
        frame.setLocation(400,150);
    }

    public void actionPerformed(ActionEvent ae){
        
        String a = t1.getText();
        String bb = t2.getText();
        String c = t3.getText();
        String d = t4.getText();
        String e = t5.getText();
        String ff = t6.getText();
        String g = t7.getText();
        String h = t8.getText();
        String i = t9.getText();
        String j = t10.getText();
        String k = t11.getText();
        String l = t12.getText();
        if(ae.getSource() == b){
            try{
                connector cc = new connector();
                String q = "insert into employee values('"+a+"','"+bb+"','"+c+"','"+d+"','"+e+"','"+ff+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"','"+l+"')";
                cc.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Details Successfully Inserted");
                frame.setVisible(false);
                new AdminHome();
            }catch(Exception ee){
                System.out.println(""+ee);
            }
        }else if(ae.getSource() == b1){
            frame.setVisible(false);
            new AdminHome();
        }
    }
    public static void main(String[ ] args){
        new Add_Employee();
    }
}
