/*
 * Db2Query.java
 *
 * Created on July 5, 2007, 2:12 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package db2tablespace;

/**
 *
 * @author Chris
 */
public abstract class Db2Query {
    
    protected String sql = new String();
    
    
    /** Creates a new instance of Db2Query */
    public Db2Query() {
    }
    
    public String getQuery() {
        
        return sql;
    }
}
