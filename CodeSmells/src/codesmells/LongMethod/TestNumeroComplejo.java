/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesmells.LongMethod;

/**
 *
 * @author rociomera
 */
public class TestNumeroComplejo {
    public static void main(String[] args){
        NumeroComplejoPROBLEMA c1= new NumeroComplejoPROBLEMA(2,3); //creando el objeto
        System.out.println("El número es :"+c1.presentarNumero());
        double modulo = c1.CalcularModuloEscalar(2);
        System.out.println("El módulo es:"+modulo);
        
        
        NumeroComplejoCORREGIDO c2=new NumeroComplejoCORREGIDO(2,3); //creando el objeto
        System.out.println("El número es :"+c1.presentarNumero());
        c2.productoEscalar(2);
        double m = c2.CalcularModulo();
        System.out.println("El módulo es:"+m);
        
        /*
        NumeroComplejo c2 = new NumeroComplejo(-2,-1);
        System.out.println("El numero es :"+c2.presentarNumero());
        modulo = c2.CalcularModulo(4);
        System.out.println("El modulo es:"+modulo);
        
        
        NumeroComplejo c3 = c2.productoEscalar(5);
        System.out.println("El numero es :"+c3.presentarNumero());
        */
    }
}
