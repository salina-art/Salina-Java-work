package IX;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb"; // Update with your DB details
        String user = "root";
        String password = "password"; // Replace with your password

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM employees")) {

            System.out.println("ID\tName\tSalary");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + "\t" +
                        resultSet.getString("name") + "\t" +
                        resultSet.getDouble("salary"));
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
