/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbConnection;
import java.sql.*;
/**
 *
 * @author Admin
 */
public class dbConnection {
    
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newproject?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
            
            
            System.out.println("DataBase Connected Successfully");
            
            Statement st = con.createStatement();
            st.executeUpdate("insert into student values(105,'demo1','demo2')");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
