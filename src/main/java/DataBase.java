import java.sql.*;

public class DataBase {

    private static DataBase self = new DataBase();
    public static DataBase getSelf() {return self;}
    Connection connection = null;

    public Connection getConnection() {return connection;}

    public void connect() {
        try {
            String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=Basketball;integratedSecurity=true;";
            String user = "bazaKsr2";
            String pass = "123456789";
            connection = DriverManager.getConnection(dbURL,user,pass);
            if (connection != null) {
                DatabaseMetaData dm = connection.getMetaData();
                System.out.println("Driver name: " + dm.getDriverName());
                System.out.println("Driver version: " + dm.getDriverVersion());
                System.out.println("Product name: " + dm.getDatabaseProductName());
                System.out.println("Product version: " + dm.getDatabaseProductVersion());
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }




}
