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
public class AcuaticoRefactoring extends VehiculoCodeSmells {
    public String nombreAcuatico="";

    public String getNombreAcuatico() {
        return nombreAcuatico;
    }

    public String navegar(){
        return "Método navegar de clase Acuatico";
    }
    
    public void setNombreAcuatico(String nombreAcuatico) {
        this.nombreAcuatico = nombreAcuatico;
    }
 
    
}
