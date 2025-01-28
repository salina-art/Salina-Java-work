package IX;

import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {
        // JDBC URL, username, and password
        String url = "jdbc:mysql://localhost:3306/testdb"; // Replace 'testdb' with your database name
        String username = "root"; // Replace with your MySQL username
        String password = "root"; // Replace with your MySQL password

        try {
            // Establishing connection
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database successfully!");

            // Query to retrieve data
            String query = "SELECT * FROM students"; // Replace 'students' with your table name
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            // Displaying the retrieved data
            while (resultSet.next()) {
                int id = resultSet.getInt("id"); // Replace 'id' with your column name
                String name = resultSet.getString("name"); // Replace 'name' with your column name
                int age = resultSet.getInt("age"); // Replace 'age' with your column name
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }

            // Closing the connection
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}

