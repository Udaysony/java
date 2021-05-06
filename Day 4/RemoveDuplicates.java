import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String q = "DELETE s1 FROM newt s1 INNER JOIN newt s2 WHERE s1.id < s2.id AND s1.name = s2.name;";

        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_jdbc?iseSSL=false", "root", "test1"))
        {
            Statement stat = connection.createStatement();
            {
                int result = stat.executeUpdate(q);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace(System.err);
        }
    }

}