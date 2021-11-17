/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Admin
 */
public class databaseconnection {
    public static String url = "jdbc:sqlserver://localhost:1433;databaseName=testthijava3";
    public static String user = "sa";
    public static String pass = "123";
    
    public static Connection getDBConnection(){
        Connection con=null;
        try {
            con=DriverManager.getConnection(url, user, pass);
            return  con;
        } catch (Exception e) {
            System.out.println("Lỗi connection "+e.toString());
        }
        return null;
    }
}
