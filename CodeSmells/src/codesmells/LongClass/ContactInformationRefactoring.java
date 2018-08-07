/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesmells.LongClass;

import codesmells.*;
import codesmells.DataClumps.*;

/**
 *
 * @author Yoselin
 */


/***CODE SMELLS*****/
//Vemos que esta clase es demasiado larga
public class ContactInformationRefactoring {
    String firstName;
    String lastName;
    String zipcode;
    String streetAddress1;
    String streetAddress2;
    String city;
    String state;
    String country;
    String phoneNumber;

    public ContactInformationRefactoring() {
    }

    public ContactInformationRefactoring(String firstName, String lastName, String zipcode, String streetAddress1, String streetAddress2, String city, String state, String country, String phoneNumber){
        this.firstName=firstName;
        this.lastName=lastName;
        this.zipcode=zipcode;
        this.streetAddress1=streetAddress1;
        this.streetAddress2=streetAddress2;
        this.city=city;
        this.state=state;
        this.country=country;
        this.phoneNumber=phoneNumber;
    }
    
    public boolean SubmitCreditCardOrder(String firstName, String lastName, String zipcode, String streetAddress1, String streetAddress2){
    //submit order
        return true;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getStreetAddress1() {
        return streetAddress1;
    }

    public void setStreetAddress1(String streetAddress1) {
        this.streetAddress1 = streetAddress1;
    }

    public String getStreetAddress2() {
        return streetAddress2;
    }

    public void setStreetAddress2(String streetAddress2) {
        this.streetAddress2 = streetAddress2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
    
}
