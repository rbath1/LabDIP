/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author rbath1
 */
public class Startup {
//      public static enum ServiceQuality {
//           GOOD, FAIR, POOR
//    };
      public static void main(String[] args) {
             TipCalcTypeStrategy baggageTip = 
                     new BaggageServiceTipCalculator(
                     BaggageServiceTipCalculator.ServiceQuality.FAIR, 20);
             FoodServiceTipCalculator foodTip =
                     new FoodServiceTipCalculator(
                     FoodServiceTipCalculator.ServiceQuality.GOOD, 35.99);
             
//             TipCalcTypeStrategy[] service = {baggageTip, foodTip};
             
             TipCalcService ts = new TipCalcService();
             
             System.out.println("Baggage Tip: " + ts.getTipAmountForService(baggageTip));
             System.out.println("Food Tip: " + ts.getTipAmountForService(foodTip));
             
      }
        
    
}
