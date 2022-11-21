package com.mluneau.atelierbackendjava.models;

public class Player implements Comparable<Player> {

    private int id;
    private String firstname;
    private String lastname;
    private String shortname;
    private Character sex;
    private Country country;
    private Data data;

    // Constructor
    public Player() {}

    public Player(Player source) {
        super();
    } 
    
    // Getters
    public int getId() {
        return this.id;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public String getShortname() {
        return this.shortname;
    }

    public Character getSex() {
        return this.sex;
    }

    public Country getCountry() {
        return this.country;
    }

    public Data getData() {
        return this.data;
    }

    // Setters --not needed for this exercice--
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
    
    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public int compareTo(Player o) {
        return (this.getData().getRank() - o.getData().getRank());
    }

}
