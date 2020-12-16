package hello.HelloSpring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleDBConnector {
    public static void main(String[] args) {
        Connection conn = null;

        String dri = "oracle.jdbc.driver.oracleDriver";
        String uri = "jdbc:oracle.thin@localhost:1521:xe";
        String id = "lsw";
        String pw = "1234";


        try {
            Class.forName(dri);
            conn = DriverManager.getConnection(uri, id, pw);
        } catch (ClassNotFoundException e) {
            System.err.println("dirver err : "+e.getMessage());
        } catch (SQLException e) {
            System.err.println("");
        }
    }
}
