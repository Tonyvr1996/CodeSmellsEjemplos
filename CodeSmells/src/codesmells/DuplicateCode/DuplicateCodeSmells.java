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
public class DuplicateCodeSmells {
    int [] arreglo1={1,2,3,4,5,6};
    int [] arreglo2={8,9};
    
    /*************CODE SMELLS************/
    //AMBOS CÓDIGOS HACEN LO MISMO
    public int calcularSumaTotalArreglos(){
        
        int sumaArreglo1=0;
        for(int i=0;i<arreglo1.length;i++){
            sumaArreglo1+=arreglo1[i];
        }
        
        int sumaArreglo2=0;
        for (int i=0;i<arreglo2.length;i++){
            sumaArreglo2+=arreglo2[i];
        }
        
        return sumaArreglo1+sumaArreglo2;       
        
    }
    
}
