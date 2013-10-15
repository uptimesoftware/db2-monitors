/*
 * Db2QueryBpWriteIo.java
 *
 * Created on July 4, 2007, 1:35 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package db2bufferpool;

/**
 *
 * @author Chris
 */
public class Db2QueryBpWriteIo extends Db2Query {
    
    /**
     * Creates a new instance of Db2QueryBpWriteIo
     */
    public Db2QueryBpWriteIo() {
    
        sql = "select BP_NAME, AVERAGE_WRITE_TIME_MS, AVERAGE_ASYNC_WRITE_TIME_MS, AVERAGE_SYNC_WRITE_TIME_MS, PERCENT_WRITES_ASYNC from SYSIBMADM.BP_WRITE_IO";
        
    }
    
}
