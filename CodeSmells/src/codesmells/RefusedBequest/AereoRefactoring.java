/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesmells.RefusedBequest;

/**
 *
 * @author Yoselin
 */
public class AereoRefactoring extends VehiculoRefactoring {
    
    public String nombreAereo="";    
    
    public String volar(){
     return "Método volar desde clase Aereo";
    }
    
    public String getNombreAereo() {
        return nombreAereo;
    }

    public void setNombreAereo(String nombreAereo) {
        this.nombreAereo = nombreAereo;
    }
  
    
}
