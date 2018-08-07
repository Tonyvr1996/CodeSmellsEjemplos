/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesmells.LongMethod;

/**
 *
 * @author veas
 */
public class NumeroComplejoCORREGIDO {
    private double real;
    double imaginario;
    
    public NumeroComplejoCORREGIDO(double realp, double imaginariop){
        real = realp;
        imaginario = imaginariop;
    }
    
    public NumeroComplejoCORREGIDO(){
    }
    
    /**
     * producto escalar del número por un factor dado como parámetro 
     * @param factor, es valor por el cual voy a realizar el producto escalar
     * @return 
     */
    public void productoEscalar(double factor){
        
        NumeroComplejoCORREGIDO c1 = new NumeroComplejoCORREGIDO();
        this.real=real * factor;
        this.imaginario= imaginario * factor;
 
    }
        
    /**
     * Calcula el modulo del numero imaginario 
     * @return double
     */
    public double CalcularModulo(){               
        return Math.sqrt( Math.pow(real,2) + Math.pow(imaginario, 2) );
    }
    
    public double getReal(){
        return real;
    }
    
    public double getImaginario(){
        return imaginario;
    }
    
    public void setReal(double real){
        this.real = real;
    }
    
    public void setImaginario(double imaginario){
        this.imaginario = imaginario;
    }
    
    
    
    
    
    
    
    /**
     * Retorna un String que el la representacion en coordenadas del numero complejo
     * @return String
     */
    public String presentarNumero(){
        return real+" + "+imaginario+"i";
    }

}
