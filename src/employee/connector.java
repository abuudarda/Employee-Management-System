/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author User
 */
import java.sql.*;

public class connector {

    public Connection c;
    public Statement s;

    public connector() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///ems", "root", "");
            s = c.createStatement();
        } catch (Exception err) {
            err.printStackTrace();

        }
    }
}
