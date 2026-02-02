package pdf1;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class Assignment_02 {

    static private String url = "jdbc:mysql://localhost:3306/coursedb";
    static private String user = "jeena";
    static private String password = "jeena";

    static void getData(Statement statement) throws SQLException {

        try (ResultSet resultSet = statement.executeQuery("select * from course")) {
            System.out.println();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");

                System.out.println(id + " " + name + " " + price);
            }
            System.out.println();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection(url, user, password)) {

            Statement statement = connection.createStatement();

            System.out.println("Database connected successfully !!!");

            String CREATET_ABLE = "CREATE TABLE IF NOT EXISTS course(id INT PRIMARY KEY, name VARCHAR(100), price FLOAT)";
            statement.executeUpdate(CREATET_ABLE);
            System.out.println("Table created");

            getData(statement);

            String INSERT_DATA = "INSERT INTO course (id, name, price) VALUES (1, 'AI', 45.67)";
            statement.executeUpdate(INSERT_DATA);
            System.out.println("data inserted");

            getData(statement);

            String UPDATE_DATA = "UPDATE course SET name='BI' WHERE id=1";
            statement.executeUpdate(UPDATE_DATA);
            System.out.println("data updated");
            getData(statement);

        } catch (

        SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
