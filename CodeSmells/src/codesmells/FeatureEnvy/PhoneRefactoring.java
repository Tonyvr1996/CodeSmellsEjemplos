/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesmells.FeatureEnvy;

/**
 *
 * @author Yoselin
 */
public class PhoneRefactoring {
    private final String unformattedNumber;
    
    /**************REFACTORING********/
   //Se creó un método adicional llamado toFormattedString en la clase PhoneRefactoring para evitar
   // que la claseCustomerRefactactoring esté accediendo a gran cantidad de sus métodos y sólo acceda por lo menos a uno.
    
   public PhoneRefactoring(String unformattedNumber) {
      this.unformattedNumber = unformattedNumber;
   }
   public String getAreaCode() {
      return unformattedNumber.substring(0,3);
   }
   public String getPrefix() {
      return unformattedNumber.substring(3,6);
   }
   public String getNumber() {
      return unformattedNumber.substring(6,10);
   }
   
   public String toFormattedString() {
      return "(" + getAreaCode() + ") " + getPrefix() + "-" + getNumber();
   }
   
}
