package com.mluneau.atelierbackendjava.models;


public class Player {
    private Integer id;
    private String firstname;
    private String lastname;
    private String shortname;
    private Character sex;
    private Country country;
    private Data data;

    // Constructors
    public Player(Integer id, String firstname, String lastname, String shortname, Character sex, Country country, Data data) {
       this.id = id;
       this.firstname = firstname;
       this.lastname = lastname;
       this.shortname = shortname;
       this.sex = sex;
       this.country = country;
       this.data = data; 
    }

    public Player(Player source) {
        this.id = source.id;
        this.firstname = source.firstname;
        this.lastname = source.lastname;
        this.shortname = source.shortname;
        this.sex = source.sex;
        this.country = new Country(source.country);
        this.data = new Data(source.data);
    }

    // Getters
    public Integer getId() {
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
    public void setId(Integer id) {
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

}
