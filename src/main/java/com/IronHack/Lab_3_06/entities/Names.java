package com.IronHack.Lab_3_06.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Names {

    private String firstName;
    private String lastName;
    private String middleName;
    private String saludation;

    public Names() {
    }

    public Names(String firstName, String lasName, String middleName, String saludation) {
        this.firstName = firstName;
        this.lastName = lasName;
        this.middleName = middleName;
        this.saludation = saludation;
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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSaludation() {
        return saludation;
    }

    public void setSaludation(String saludation) {
        this.saludation = saludation;
    }
}

