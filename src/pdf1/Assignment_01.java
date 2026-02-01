package pdf1;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Assignment_01 {

    private static final String url = "jdbc:mysql://localhost:3306/student_db";
    private static final String username = "jeena";
    private static final String password = "jeena";

    public static void main(String[] args) {

        try (Connection conection = DriverManager.getConnection(url, username, password)) {

            Statement statement = conection.createStatement();
            String query = "select * from student";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int rollNo = resultSet.getInt("roll_no");
                String name = resultSet.getString("name");
                String course = resultSet.getString("course");

                System.out.println("");
                System.out.println("Roll No = " + rollNo);
                System.out.println("Name = " + name);
                System.out.println("Course = " + course);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
