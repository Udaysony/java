import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InitialConnect {
    private static final String QUERY = "select * from student";

    public static void main(String[] args) {

        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_jdbc?iseSSL=false", "root", "test1"))
        {
            Statement stat = connection.createStatement();

            ResultSet results = stat.executeQuery(QUERY);
            System.out.println("id name address);
            while(results.next())
            {
                int id = results.getInt("student_id");
                String name = results.getString("name");
                String address = results.getString("address");

                System.out.println(id+ ",  " + name + ", " + address);

            }
        }
        catch (SQLException e)
        {
            printSQLException(e);
        }
    }

    private static void printSQLException(SQLException ex) {

        for(Throwable e : ex)
        {
            if(e instanceof SQLException)
            {
                e.printStackTrace(System.err);
            }
        }
    }
}