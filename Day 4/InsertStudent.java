import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertStudent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll No: ");
        int rollNo = sc.nextInt();
        System.out.println("Enter Name: ");
        String name = sc.next();
        System.out.println("Address: ");
        String address = sc.next();

        String q = "INSERT INTO student " + "VALUES ('" + rollNo + "','" + name + "','" + address + "');";
        System.out.println(q);

        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_jdbc?iseSSL=false", "root", "test1"))
        {
            Statement s = conn.createStatement();
            {
                int result = s.executeUpdate(q);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace(System.err);
        }
    }

}