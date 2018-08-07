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
public class CuadradoRefactoring implements IOperacionesRefactoring {
 
    private String nombre;
    private double tamañoLado;
    private String color;
    
    /**************REFACTORIZACIÓN********************/
    //Como la clase contenía campos públicos los encapsulamos para que
    // se puedan acceder solamente por los getters and setters
    // Se creó una interface para poder ir agregando operaciones
    
    public CuadradoRefactoring(){
        
    }
    
    public CuadradoRefactoring(String nombre){
        this.nombre=nombre;
    }
    
    public CuadradoRefactoring(String nombre,double tamañoLado,String color){
        this.nombre=nombre;
        this.tamañoLado=tamañoLado;
        this.color=color;
    }
    
       
    public void pintar(String color){
        this.color=color;
    }
    
    @Override
    public double calcularArea(){
        return tamañoLado*tamañoLado;
    }
    
    @Override
    public double calcularPerimetro(){
        return 4*tamañoLado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTamañoLado() {
        return tamañoLado;
    }

    public void setTamañoLado(double tamañoLado) {
        this.tamañoLado = tamañoLado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
}
