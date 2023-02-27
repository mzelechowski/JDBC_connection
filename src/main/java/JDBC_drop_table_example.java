import java.sql.*;

public class JDBC_drop_table_example {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection =
                    DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test1",
                            "root", "");
            if (connection == null) {
                System.out.println("Brak połączenia z bazą danych");
            } else {
                System.out.println("Połączyłem się WIELKI SIUSIAK");
            }
            statement = connection.createStatement();

            String sqlDropTable = "DROP TABLE books;";

            statement.executeUpdate(sqlDropTable);


//            String sqlSelect = "SELECT * FROM books ; ";
//            resultSet = statement.executeQuery(sqlSelect);

//            while (resultSet.next()) {
//                int id = resultSet.getInt("id");
//                String title = resultSet.getString("title");
//                Date date = resultSet.getDate("published");
//                System.out.println("id: " + id + " title: " + title + " published: " + date );
//            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                //resultSet.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                statement.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
