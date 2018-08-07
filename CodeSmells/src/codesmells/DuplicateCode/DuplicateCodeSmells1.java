/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesmells.DuplicateCode;

/**
 *
 * @author Yoselin
 */
public class DuplicateCodeSmells1 {
    int [] arreglo1={1,2,3,4,5,6};
    int [] arreglo2={8,9};
    
    /*************REFACTORING************/
          //CREAMOS UN MÉTODO EN COMÚN
    public int calcularSumaTotalArreglos(){ 
        return sumaArreglo(arreglo1)+sumaArreglo(arreglo2);            
    }
    
    public int sumaArreglo(int[] arreglo){
        int sumaArreglo=0;
        for(int i=0;i<arreglo.length;i++){
            sumaArreglo+=arreglo1[i];
        }
        return sumaArreglo;
    }
    
}
