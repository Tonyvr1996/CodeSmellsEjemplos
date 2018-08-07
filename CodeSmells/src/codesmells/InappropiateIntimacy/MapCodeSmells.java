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
public class MapCodeSmells {
    
    /*****CODE SMELLS***/
    private static int INITIAL_CAPACITY=10;
    private Object[] keys = new Object[INITIAL_CAPACITY];
    private Object[] values =new Object[INITIAL_CAPACITY];

    public Object[] getKeys(){
        return keys;
    }
    
    public Object[] getValues(){
        return values;
    }
}
