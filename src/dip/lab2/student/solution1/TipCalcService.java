/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author rbath1
 */
public class TipCalcService {
    private TipCalcTypeStrategy tipType;
    
    
    public TipCalcService(TipCalcTypeStrategy tts){
        tipType = tts;
    }
    
    public TipCalcService(){
    }
    
     public void setTipType(TipCalcTypeStrategy tipType) {
        if(tipType == null) {
            throw new NullPointerException();
        }
        
        this.tipType = tipType;
    }
     
     public double getTipAmountForService(TipCalcTypeStrategy tipType){
         return tipType.getTip();
         
     }
    
}
