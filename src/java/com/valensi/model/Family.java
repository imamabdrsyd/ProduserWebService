/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.model;

import com.valensi.Person;
import java.util.List;

/**
 *
 * @author user
 */
public class Family {
    private String marga;
    private List<Person> Person;

    public Family() {
    }

    public Family(String marga, List<Person> Person) {
        this.marga = marga;
        this.Person = Person;
    }

    
    /**
     * @return the marga
     */
    public String getMarga() {
        return marga;
    }

    /**
     * @param marga the marga to set
     */
    public void setMarga(String marga) {
        this.marga = marga;
    }

    /**
     * @return the Person
     */
    public List<Person> getPerson() {
        return Person;
    }

    /**
     * @param Person the Person to set
     */
    public void setPerson(List<Person> Person) {
        this.Person = Person;
    }
    
}
