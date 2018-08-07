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
public class CustomerRefactoring {
    
   private PhoneRefactoring mobilePhone;
   private String codi;
   private String ext;
   
   /**************REFACTORING********/
   //Se creó un método adicional en la clase PhoneRefactoring para evitar
   // que la claseCustomerRefactactoring esté accediendo a gran cantidad de sus métodos y sólo acceda por lo menos a uno.
   
   public String getMobilePhoneNumber() {
      return mobilePhone.toFormattedString()+"-"+codi+"-"+ext;
   }
}
