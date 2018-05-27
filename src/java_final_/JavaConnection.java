/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_final_;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Anubhav
 */
public class JavaConnection {
    Connection conn = null;
    public static Connection ConnecrDb(){
        try{
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            //Connection conn = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\anubh\\Desktop\\DBase.accdb");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/dbase","root","");
            System.out.println("Connected");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
