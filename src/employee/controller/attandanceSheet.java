
package employee;


import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

import java.awt.event.*;
import java.sql.*;

class attandanceSheet  {

    JFrame frame;
    JLabel id8, id, aid, id1, aid1, id2, aid2, id3, aid3, id4, aid4, id5, aid5, id6, aid6, id7, aid7, id9, id10, id11, id12, id13, id14, id15, id16, id17, lab;
    String emp_id, Name, fname, address, phone, email_id, education, post, age, dob, code;
    JButton b1, b2;
    ImageIcon icon;
    static JTable table;

    attandanceSheet() {

        // frame = new JFrame("Print Data");
        // frame.setVisible(true);
        // frame.setSize(595, 642);
        // frame.setLocation(450, 200);
        // frame.setBackground(Color.white);
        // frame.setLayout(null);
        String[] columnNames = {"Name","ID"};

        String Name="";
        String ID="";
        try {
            connector con = new connector();
            String str = "select * from attandance";
            ResultSet rs = con.s.executeQuery(str);

            String data[][] = new String[25][2];
            int i = 0;
            while (rs.next()) {
                String id = rs.getString("emp_id");
                String nom = rs.getString("Name");
                data[i][0] = id ;
                data[i][1] = nom;
                i++;
            }
            
            DefaultTableModel model = new DefaultTableModel(data, columnNames);
            table = new JTable(model);
            table.setShowGrid(true);
            table.setShowVerticalLines(true);
            JScrollPane pane = new JScrollPane(table);
            JFrame f = new JFrame("Attendance Sheet");
            JPanel panel = new JPanel();
            panel.add(pane);
            f.add(panel);
            f.setSize(500, 250);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setVisible(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
   }

    public static void main(String[] args) {
        new attandanceSheet();
    }

}
