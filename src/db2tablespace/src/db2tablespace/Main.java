/*
 * Main.java
 *
 * Created on May 11, 2007, 10:54 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package db2tablespace;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;


/**
 *
 * @author Chris
 */
public class Main {
    
    
    private static Db2Query query;
    private static ArrayList Queries = new ArrayList();
    
    /** Creates a new instance of Main */
    public Main() {
        
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        if (args.length != 5){
            System.err.println("Invalid Use");
            System.exit(1);
        }
        
        // System.out.println("ADDING QUERY OBJECTS");
        
        Queries.add(new Db2TablespaceUtilization());
        //Queries.add(new Db2QueryBpReadIo());
        //Queries.add(new Db2QueryBpWriteIo());
        
        // System.out.println("DONE ADDING QUERY OBJECTS");
        
        /*
         * Args
         * 0 - Hostname
         * 1 - Port
         * 2 - Userid
         * 3 - Password
         * 4 - Database
         */
        
        try {
            Db2DatabaseConnection db   = new Db2DatabaseConnection(args[0], args[1], args[4]);
            db.Connect(args[2], args[3]);
            for (int i=0; i < Queries.size(); ++i){
                query = (Db2Query)Queries.get(i);
                db.query(query.getQuery());
                ResultSetMetaData rsmd  = db.rs.getMetaData();
                while (db.rs.next()) {
                    for (int j = 2; j <= rsmd.getColumnCount(); ++j) {
                        System.out.println(db.rs.getString(1) + "." + rsmd.getColumnName(j) + " " + db.rs.getLong(j));
                    }
                }
            }
            db.Close();
            System.exit(0);
            
        } catch(Exception e){
            System.err.println(e.getMessage());
            System.out.println("WARN - Monitor Failed");
            System.exit(1);
        }
    }
}
