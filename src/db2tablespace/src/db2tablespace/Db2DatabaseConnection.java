/*
 * Db2DatabaseConnection.java
 *
 * Created on March 18, 2007, 1:16 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package db2tablespace;
import java.sql.*;

public class Db2DatabaseConnection {
    
    private String url = null;
    private Connection con;
    public ResultSet rs = null;
    
    /**
     * Creates a new instance of Db2DatabaseConnection
     */
    public Db2DatabaseConnection(String dbHost, String dbPort, String dbName) {
        try {
            url = "jdbc:db2://" + dbHost + ":" + dbPort + "/" + dbName;
            Class.forName("com.ibm.db2.jcc.DB2Driver");
        }catch (Exception e){
            System.out.println(e);            
        }
    }
    
    public void Connect(String user, String password) {
        try {
            con = DriverManager.getConnection( url, user, password);
        }catch (Exception e) {
            System.out.println(e);
            // Catch Connection Exceptions
        }
    }
    
    public void Close() {
        try {
            con.close();
        } catch (Exception e) {
            // Close exception
        }
    }
    
    public ResultSet query(String sqlQuery) {
        Statement stmt;
        try {
            
            stmt = con.createStatement();
            rs = stmt.executeQuery( sqlQuery );
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }
}

