/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author rbath1
 */
public abstract class TipCalcTypeStrategy {
//    private static final double MIN_BILL = 0.00;
//    private static final double MAX_BILL = 100.00;
//    private static final String BILL_ENTRY_ERR =
//            "Error: bill must be between " + MIN_BILL + " and "
//            + MAX_BILL;
//    private static final double GOOD_RATE = 0.20;
//    private static final double FAIR_RATE = 0.15;
//    private static final double POOR_RATE = 0.10;
    
//    public enum ServiceQuality {
//        GOOD, FAIR, POOR
//    }
//    
//    private ServiceQuality serviceQuality;
    
    public TipCalcTypeStrategy(){ 
    }
  //  public abstract void setTip();
    public abstract double getTip();
    
//    public final void setServiceQuality(ServiceQuality q) {
//        // No need to validate because enums provide type safety!
//        serviceQuality = q;
//    }
//    public ServiceQuality getServiceQuality() {
//        return serviceQuality;
//    } 
}

