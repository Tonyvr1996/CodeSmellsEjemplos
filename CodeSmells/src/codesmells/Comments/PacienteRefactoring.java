/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesmells.Comments;
import java.security.SecureRandom;

/**
 *
 * @author 
 */
public class PacienteRefactoring {
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;
    private String DNI;
    private double imc;
    
    public PacienteRefactoring(){
        DNI=generarDNI();
        sexo='H';
    }
    
    public PacienteRefactoring(String nombre, int edad, char sexo){
        DNI=generarDNI();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    
    public PacienteRefactoring(String nombre, int edad, char sexo,
                        double peso, double altura){
        DNI=generarDNI();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    /*****************REFACTORING*******************/   
    /**
     * Calcula el índice de masa coporal de un paciente
     * @return double
     */
    public double calcularIMC(){
        return peso / Math.pow(altura,2);
    }
    
    /**
     * Establece el rango de acuerdo al índice de masa corporal
     * @return String
     */
    public String establecerRangoIMC(){
        if (calcularIMC()<18.5){
            return "Peso insuficiente";
        }else{
            return "Peso normal";
        }
        
        
    }
    
    private String generarDNI(){
        SecureRandom randomNumbers = new SecureRandom();
        String numero = "";
        int n;
        for(int i = 0;i < 8;i++){
            n = randomNumbers.nextInt(10);
            numero+=n;
        }
        return numero;
    }
    
    
    
    public boolean esMayorEdad(){
        if (edad>18){
            return true;
        }else{
            return false;
        }
    }
    
    //@Override
    public String toString(){
        return "DNI: "+DNI+",nombre: "+nombre+",edad: "+edad;
    }
    
    
    public static void main(String[] args){
        PacienteRefactoring p = new PacienteRefactoring("rocio",27,'M',60,165);
        System.out.println(p.establecerRangoIMC());
    }
    

}
