package hello.HelloSpring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleDBConnector {

    private static String dri = "oracle.jdbc.driver.OracleDriver";
    private static String uri = "jdbc:oracle.thin:@localhost:1521:XE";
    private static String id = "lsw";
    private static String pw = "1234";

    public static Connection getConnection() {

        Connection conn = null;

        try {
            Class.forName(dri);
            conn = DriverManager.getConnection(uri, id, pw);
        } catch (ClassNotFoundException e) {
            System.err.println("dirver err : "+e.getMessage());
        } catch (SQLException e) {
            System.err.println("");
        }

        if(conn !=null)
            try {
                conn.close();
            } catch (SQLException e) {
                System.err.println("conn err"+e.getMessage());
            }
        return conn;
    }
}
