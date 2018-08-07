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
public class CustomerCodeSmells {
    private PhoneCodeSmells mobilePhone;
    private String codi;
    private String ext;
    /**CODE SMELLS**/
    // El método getMobilePhoneNumber accede a los datos de otro objeto, más que a sus propios datos.
    
   public String getMobilePhoneNumber() {
      return "(" + 
         mobilePhone.getAreaCode() + ") " +
         mobilePhone.getPrefix() + "-" +
         mobilePhone.getNumber()+"-" +
         codi+"-"+ext;
    }
}
