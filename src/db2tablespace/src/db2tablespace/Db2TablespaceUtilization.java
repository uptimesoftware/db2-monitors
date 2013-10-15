/*
 * Db2TablespaceUtilization.java
 *
 * Created on July 4, 2007, 1:35 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package db2tablespace;

/**
 *
 * @author Chris
 */
public class Db2TablespaceUtilization extends Db2Query {
      
    /**
     * Creates a new instance of Db2TablespaceUtilization
     */
    public Db2TablespaceUtilization() {
    
        sql = "select TBSP_NAME, TBSP_USED_SIZE_KB, TBSP_FREE_SIZE_KB, TBSP_UTILIZATION_PERCENT, TBSP_USED_PAGES, TBSP_FREE_PAGES from SYSIBMADM.TBSP_UTILIZATION";
        
    }
    
}
