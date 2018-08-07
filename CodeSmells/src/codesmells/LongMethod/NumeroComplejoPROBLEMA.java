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
public class NumeroComplejoPROBLEMA {
    private double real;
    double imaginario;
    
    public NumeroComplejoPROBLEMA(){
    }
    
    public NumeroComplejoPROBLEMA(double realp, double imaginariop){
        real = realp;
        imaginario = imaginariop;
    }
      
    /**
     * Calcula el modulo de un número imaginario después de multiplicarlo por un escalar 
     * @return double
     */
    public double CalcularModuloEscalar(double factor){
        NumeroComplejoPROBLEMA c1 = new NumeroComplejoPROBLEMA();
        c1.real = real * factor;
        c1.imaginario = imaginario * factor;          
        return Math.sqrt( Math.pow(c1.real,2) + Math.pow(c1.imaginario, 2) );
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
    
    
    public String presentarNumero(){
        return real+" + "+imaginario+"i";
    }
                
}
