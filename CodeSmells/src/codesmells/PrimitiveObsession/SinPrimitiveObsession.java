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
public class SinPrimitiveObsession {
    public static void main(String args[]) {



        for (Ciudad city:Ciudad.ALL_CITIES) {

          System.out.println(city.toString());

        }

    }
}
