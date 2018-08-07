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
public class PacienteCodeSmells {
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;
    private String DNI;
    private double imc;
    
    public PacienteCodeSmells(){
        DNI=generarDNI();
        sexo='H';
    }
    
    public PacienteCodeSmells(String nombre, int edad, char sexo){
        DNI=generarDNI();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    
    public PacienteCodeSmells(String nombre, int edad, char sexo,
                        double peso, double altura){
        DNI=generarDNI();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    /***********CODE SMELLS***********/
    /**
     * Establece el rango de acuerdo al imc, para ello
     * debemos primero realizar el cálculo del imc para
     * poder clasificar al paciente dentro de un rango insufiente o
     * en el rango normal de acuerdo a sus especificaciones y poder
     * otorgar un diagnóstico
     * @return String
     */
    public String establecerRangoIMC(){
        //CALCULA EL ÍNDICE DE MASA COPORAL
        imc=peso / Math.pow(altura,2);
        if (imc<18.5){ //VERIFICAMOS SI ES MENOR AL RANGO
            return "Peso insuficiente"; //RETORNA 
        }else{
            return "Peso normal"; //RETORNA
        }
        //FIN
        
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
        PacienteRefactoring p = new PacienteRefactoring("rocio",27,'M',160,195);
        System.out.println(p.establecerRangoIMC());
    }
    

}
