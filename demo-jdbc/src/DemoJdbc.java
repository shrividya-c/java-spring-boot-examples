import java.sql.*;

public class DemoJdbc {
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
        String sql_query2 = "insert student values (\n" +
                "    2,\n" +
                "    'cooper',\n" +
                "    'sheldon',\n" +
                "    'cse',\n" +
                "    26\n" +
                "); ";
        String sql_query_i1 = "insert student values (\n" +
                "    3,\n" +
                "    'hofstader',\n" +
                "    'leonard',\n" +
                "    'cse',\n" +
                "    35\n" +
                "); ";
        String sql_query_i2 = "insert student values (\n" +
                "    4,\n" +
                "    'wolowitz',\n" +
                "    'howard',\n" +
                "    'cse',\n" +
                "    33\n" +
                "); ";
        String sql_query3 = "delete from student where student_id=2;";
        String sql_query4 = "update student set first_name='monica', last_name='geller' where student_id=1;";
        try {
            Statement statement = connection.createStatement();

//            System.out.println(resultSet.next());
//            System.out.println("name:" + resultSet.getString("first_name"));

            statement.execute(sql_query2);
            statement.execute(sql_query_i1);
            statement.execute(sql_query_i2);
            statement.execute(sql_query3);
            statement.execute(sql_query4);
            ResultSet resultSet = statement.executeQuery(sql_query);

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
