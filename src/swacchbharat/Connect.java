/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swacchbharat;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Virat
 */
public class Connect {
    Connection con=null;
    public static Connection ConnectDB() throws ClassNotFoundException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/virat","root","12345678");
            return con;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
        
        
    }
}
