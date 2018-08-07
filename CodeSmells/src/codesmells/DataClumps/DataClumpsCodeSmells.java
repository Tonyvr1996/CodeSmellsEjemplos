/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesmells.DataClumps;

/**
 *
 * @author Veas
 */
public class DataClumpsCodeSmells {
    
    private double saleAmount;
    
    /***********CODE SMELLS**************/
    //Agrupaciones de datos
    //Se puede evidenciar que este método tiene muchas agrupaciones de datos
    public boolean SubmitCreditCardOrder(String firstName, String lastName, String zipcode, String streetAddress1, String streetAddress2, String city, String state, String country, String phoneNumber, String creditCardNumber, int expirationMonth, int expirationYear, double saleAmount){
    //submit order
        return true;
    }
    
    
}