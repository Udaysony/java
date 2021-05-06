import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JoinDemo {

    private static final String q = "select student.roll_no, student.name, course.course_id from student inner join course on student.roll_no = course.roll_no;";

    public static void main(String[] args) {

        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_jdbc?iseSSL=false", "root", "test1"))
        {
            Statement stat = connection.createStatement();

            ResultSet results = stat.executeQuery(q);
            while(results.next())
            {
                int id = results.getInt("roll_no");
                String name = results.getString("name");
                int course_id= results.getInt("course_id");
                System.out.println(id + ",       " + name + ",    " + course_id);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace(System.err);
        }
    }

}