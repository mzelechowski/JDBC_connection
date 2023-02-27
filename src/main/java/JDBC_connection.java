import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.locks.Condition;

public class JDBC_connection {
    public static void main(String[] args) {
        Connection connection=null;
        try{
            connection =
                    DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test1",
                            "root", "");
            if (connection==null){
                System.out.println("Brak połączenia z bazą danych");
            } else {
                System.out.println("Połączyłem się WIELKI SIUSIAK");
            }
        }catch (SQLException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
