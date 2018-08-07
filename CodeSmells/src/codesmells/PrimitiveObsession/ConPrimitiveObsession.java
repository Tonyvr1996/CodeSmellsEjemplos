/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesmells.PrimitiveObsession;

/**
 *
 * @author Yoselin
 */
public class ConPrimitiveObsession {
    public static void main(String args[]) {
        
            //SE DECLARAN DATOS PRIMITIVO
            Integer[] cityPopulations = {130000000, // Guayaquil
                                        21903623, // Quito
                                        12570000, // Manabí
                                        1932763, // Napo
                                        1605602, // Tungurahua
                                        4119190 // Boliva
            };

 
           for (Integer cityPopulation:cityPopulations){
              System.out.println(cityPopulation);
           }

   }

}

