/*
 * Db2QueryBpHitRatio.java
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
public class Db2QueryBpHitRatio extends Db2Query {
      
    /**
     * Creates a new instance of Db2QueryBpHitRatio
     */
    public Db2QueryBpHitRatio() {
    
        sql = "select BP_NAME, TOTAL_HIT_RATIO_PERCENT, DATA_HIT_RATIO_PERCENT, INDEX_HIT_RATIO_PERCENT, XDA_HIT_RATIO_PERCENT from SYSIBMADM.BP_HITRATIO";
        
    }
    
}
