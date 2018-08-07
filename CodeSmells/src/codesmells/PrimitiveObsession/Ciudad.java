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
public class Ciudad {


private final String name;


private final int  population;


private final Continente continent;


public String getName() {
return name;

}


public int getPopulation() {


return  population;

}


public Continente getContinent() {


return continent;

}




public Ciudad(String name, int population, Continente continent) {


this.name = name;


this.population = population;


this.continent = continent;

}




public String toString() {


return String.format( "%s tiene una población de %s y está localizada en %s",


name, population, continent);

}


public static final Ciudad[] ALL_CITIES={


new Ciudad("Guayaquil",13000000,Continente.AMERICA),


new Ciudad("Quito",21903623,Continente.AMERICA),


new Ciudad("Manabí",12570000,Continente.AMERICA),


new Ciudad("El Oro",1932763,Continente.AMERICA),


new Ciudad("Cañar",1605602,Continente.AMERICA),


new Ciudad("Napo",4119190,Continente.AMERICA)

};

}
