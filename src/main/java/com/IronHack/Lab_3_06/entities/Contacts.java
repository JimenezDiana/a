package com.IronHack.Lab_3_06.entities;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Contacts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String name;
    private String title;
    private String company;

    @Embedded
    private Names coworkersNames;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "firstName", column = @Column(name = "cowrokers_first_name")),
            @AttributeOverride(name = "lastName", column = @Column(name = "cowrokers_last_name")),
            @AttributeOverride(name = "middleName", column = @Column(name = "cowrokers_middle_name")),
            @AttributeOverride(name = "saludation", column = @Column(name = "cowrokers_saludation")),


    })
    private Names friends;



    public Contacts() {
    }

    public Contacts(int id, String name, String title, String company, Names coworkersNames, Names friends) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.company = company;
        this.coworkersNames = coworkersNames;
        this.friends = friends;
    }

    public Contacts(int id, String name, String title, String company) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Names getCoworkers() {
        return coworkersNames;
    }

    public void setCoworkers(Names coworkers) {
        this.coworkersNames = coworkers;
    }

    public Names getFriends() {
        return friends;
    }

    public void setFriends(Names friends) {
        this.friends = friends;
    }
}

