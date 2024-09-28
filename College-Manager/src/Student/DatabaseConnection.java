/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author as196
 */
public class DatabaseConnection {
    

   public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String dbpath = "jdbc:mysql://localhost:3306/UNIVERSITY";
            String dbuser = "root";
            String dbpass = "abhishek@SQL";
            return DriverManager.getConnection(dbpath, dbuser, dbpass);
        } catch (ClassNotFoundException | SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            return null;
        }
    }

    public static void closeConnection(Connection cn) {
        try {
            if (cn != null) cn.close();
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error closing database resources: " + ex.getMessage());
        }
    }
}
