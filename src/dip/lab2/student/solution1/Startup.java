/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

import java.text.NumberFormat;

/**
 *
 * @author rbath1
 */
public class Startup {
//      public static enum ServiceQuality {
//           GOOD, FAIR, POOR
//    };
      public static void main(String[] args) {
             TipCalcStrategy baggageTip = 
                     new BaggageServiceTipCalculator(
                     BaggageServiceTipCalculator.ServiceQuality.FAIR, 20);
             FoodServiceTipCalculator foodTip =
                     new FoodServiceTipCalculator(
                     FoodServiceTipCalculator.ServiceQuality.GOOD, 35.99);
             
//             TipCalcTypeStrategy[] service = {baggageTip, foodTip};
             
             TipCalcService ts = new TipCalcService();
             NumberFormat nf = NumberFormat.getCurrencyInstance();

             System.out.println("Baggage Tip: " + nf.format(ts.getTipAmountForService(baggageTip)));
             System.out.println("Food Tip: " + nf.format(ts.getTipAmountForService(foodTip)));
             
      }
        
    
}
