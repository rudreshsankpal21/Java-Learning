import java.util.*;
import java.sql.*;
class databaseConnection{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String name;
        int roll;
    
        System.out.println("Enter your name : ");
        sc.nextLine();
        System.out.println("Enter your rollno");
        sc.nextInt();
        try {
            Class.forName("com.mysql.jdbc.Driver");  

            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/","root","rudresh21");  

            System.out.println("Connection done");

            Statement st=con.createStatement();  

            // st.executeUpdate("insert into students values ( " + name + " , " + roll + " ) ");  
          // Insert values
                st.executeQuery("")


            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}