
package employee;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.*;

class dataTable {
    JFrame frame;
    JLabel id8,id9;
    String emp_id,Name,fname,address,phone,email,education,post,age,dob,code;
    JButton b1,b2;
    ImageIcon icon;

    dataTable(String e_id){
        Color back = new Color(37, 54, 64);
        Color red = new Color(255, 111,114);
        Color cyan = new Color(23, 187,159);
        Color grey = new Color(145, 159,170);
        Color blue = new Color(101, 169,252);
        Color yellow = new Color(203, 163, 48);

        try{
            connector con = new connector();
            String str = "select * from employee where emp_id = '"+e_id+"'";
            ResultSet rs= con.s.executeQuery(str);

            while(rs.next()){

               
                Name = rs.getString("Name");
                fname = rs.getString("baaper_name");
                age = rs.getString("age");
                dob = rs.getString("dob");
                address = rs.getString("address");
                phone = rs.getString("phno");
                email = rs.getString("email");
                education = rs.getString("education");
                post = rs.getString("post");
                code = rs.getString("code");
                emp_id = rs.getString("emp_id");
            }
        }catch(SQLException e){
        }
 
        frame=new JFrame(Name+" Details");
        frame.setVisible(true);
        frame.setSize(595,642);
        frame.setLocation(450,200);
        frame.setBackground(cyan);
        frame.setLayout(null);


        id9=new JLabel();
        id9.setBounds(0,0,595,642);
        id9.setLayout(null);
        

        id8 = new JLabel("Details of "+Name);
        id8.setBounds(50,10,1360,70);
        frame.add(id8);
        id8.setFont(new Font("Arial",Font.BOLD,25));
        id8.setForeground(red);
        id9.add(id8);
        frame.add(id9);

        String data[][] = new String[10][2];
        data[0][0]="Employee ID";
        data[1][0]="Name";
        data[2][0]="Father's Name";
        data[3][0]="Address";
        data[4][0]="Mobile No";
        data[5][0]="Email ID";
        data[6][0]="Department";
        data[7][0]="Post";
        data[7][0]="Date of Birth";
        data[9][0]="Age";

        data[0][1]=emp_id;
        data[1][1]=Name;
        data[2][1]=fname;
        data[3][1]=address;
        data[4][1]=phone;
        data[5][1]=email;
        data[6][1]=education;
        data[7][1]=post;
        data[7][1]=dob;
        data[9][1]=age;

        String columns[] = { "Field", "Value" };

        DefaultTableModel model = new DefaultTableModel(data, columns);
        JTable table = new JTable(model);
        table.setShowGrid(true);
        table.setShowVerticalLines(true);
        JScrollPane pane = new JScrollPane(table);
        JFrame f = new JFrame("Populate JTable from Database");
        JPanel panel = new JPanel();
        panel.add(pane);
        f.add(panel);
        f.setSize(500, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        

    }

    
    public static void main(String[] args){
        new dataTable("Print Data");
    }

}
