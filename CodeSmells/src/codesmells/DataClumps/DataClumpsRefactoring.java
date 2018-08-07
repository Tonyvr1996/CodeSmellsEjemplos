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

                /***********REFACTORING*****************/
/*
A veces, diferentes partes del código contienen grupos idénticos de variables.
Estos grupos deben convertirse en sus propias clases.
A menudo, estos grupos de datos se deben a una estructura de programa deficiente o a una "copypasta programming".
*/
    public class DataClumpsRefactoring {
        public boolean SubmitCreditCardOrder(ContactInformationRefactoring customerInfo, CreditCardRefactoring card, double saleAmount){
        // … submit order
        return true;
    }
}
