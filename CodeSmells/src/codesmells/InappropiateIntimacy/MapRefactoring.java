/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesmells.InappropiateIntimacy;

/**
 *
 * @author Yoselin
 */
public class MapRefactoring {

    //REFACTORING
    //Las buenas clases deben saber tan poco sobre el otro como sea posible,  
    //ya que las clases de este tipo son más fáciles de mantener 
    //NO ES CORRECTO MOSTRAR LAS CLAVES
    private static int INITIAL_CAPACITY=10;
    private Object[] keys = new Object[INITIAL_CAPACITY];
    private Object[] values =new Object[INITIAL_CAPACITY];

    
    public Object[] getValues(){
        return values;
    }
}
