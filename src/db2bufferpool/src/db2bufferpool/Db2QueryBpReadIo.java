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
public class Db2QueryBpReadIo extends Db2Query {
    
    /**
     * Creates a new instance of Db2QueryBpWriteIo
     */
    public Db2QueryBpReadIo() {
    
        sql = "select BP_NAME, AVERAGE_READ_TIME_MS, PERCENT_SYNC_READS, AVERAGE_ASYNC_READ_TIME_MS, AVERAGE_SYNC_READ_TIME_MS, ASYNC_NOT_READ_PERCENT from SYSIBMADM.BP_READ_IO";
        
    }
    
}
