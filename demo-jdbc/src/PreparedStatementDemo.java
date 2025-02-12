import java.sql.*;

public class PreparedStatementDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/demo_jdbc?useSSL=false";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Connecting database ...");

        Connection connection;

        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected!");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }

        String sql_query = "select * from student;";
        String sql_query2 = "insert student values (?,?,?,?,?); ";

        int student_id = 111;
        String last_name = "Doe";
        String first_name = "John";
        String course = "cse";
        int age = 30;

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql_query2);
            preparedStatement.setInt(1,student_id);
            preparedStatement.setString(2,last_name);
            preparedStatement.setString(3,first_name);
            preparedStatement.setString(4,course);
            preparedStatement.setInt(5,age);


            preparedStatement.execute();
            ResultSet resultSet = preparedStatement.executeQuery(sql_query);

            System.out.println("student details: ");
            while(resultSet.next()){
                System.out.print("student id: " + resultSet.getInt(1));
                System.out.println(" , name: " + resultSet.getString(3) + " " + resultSet.getString(2));
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Connection closed!");
        }


    }
}
