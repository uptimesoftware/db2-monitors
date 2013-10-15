/*
 * Main.java
 *
 * Created on May 11, 2007, 10:54 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package db2basic;
import java.sql.ResultSetMetaData;
import java.util.Arrays;

/**
 *
 * @author Chris
 */
public class Main {
    
    /** Creates a new instance of Main */
    public Main() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        if (args.length != 7){
            System.err.println("Invalid number of arguments: " + args.length);
            System.err.println(Arrays.toString(args));
            System.exit(1);
        }
        
        /*
         * Args
         * 0 - Hostname
         * 1 - Port
         * 2 - Userid
         * 3 - Password
         * 4 - match
         * 5 - Database
         * 6 - SQL
         */
        
        String sql = null;
        String queryResult = "";
        
        sql = args[6];
        
        try {
            
            Db2DatabaseConnection db   = new Db2DatabaseConnection(args[0], args[1], args[5]);
            
            db.Connect(args[2], args[3]);
            
            db.query(sql);
            
            ResultSetMetaData rsmd  = db.rs.getMetaData();
            
            while (db.rs.next()) {
                for (int i = 1; i <= rsmd.getColumnCount(); ++i) {
                    queryResult += db.rs.getString(i) + " ";
                }
            }
            
            db.Close();
            
            //System.out.println(queryResult);
            
            if (queryResult.indexOf(args[4]) != -1){
                System.out.println("OK - Expression was matched");
                System.exit(0);
            }else {
                System.out.println("CRIT - No matches in result");
                System.exit(2);
            }
            
        } catch(Exception e){
            System.err.println(e.getMessage());
            System.out.println("WARN - Monitor Failed");
            System.exit(1);
        }
        
    }
}
