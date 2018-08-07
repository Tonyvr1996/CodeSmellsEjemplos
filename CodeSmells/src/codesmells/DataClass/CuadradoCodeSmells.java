/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesmells.DataClass;

/**
 *
 * @author Yoselin
 */
public class CuadradoCodeSmells {
    public String nombre;
    public double tamañoLado;
    public String color;
    
    
    /*******************CODE SMELLS********************************/
    
    
    public CuadradoCodeSmells(){
        
    }
    
    public CuadradoCodeSmells(String nombre){
        this.nombre=nombre;
    }
    
    public CuadradoCodeSmells(String nombre,double tamañoLado,String color){
        this.nombre=nombre;
        this.tamañoLado=tamañoLado;
        this.color=color;
    }
    
    public void pintar(String color){
        this.color=color;
    }
    
    public double calcularArea(){
        return tamañoLado*tamañoLado;
    }
    
    public double calcularPerimetro(){
        return 4*tamañoLado;
    }

}
