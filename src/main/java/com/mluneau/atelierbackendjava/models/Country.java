package com.mluneau.atelierbackendjava.models;

public class Country {

    private String code;
    private String picture;
    private CountryName name;


    // Constructors
    public Country(String code, String picture, CountryName name) {
        this.code = code;
        this.picture = picture;
        this.name = name;
    }

    public Country(Country source) { 
        this.code = source.code;
        this.picture = source.picture;
        this.name = source.name;
    }

    // Getters
    public String getCode() {
        return this.code;
    }
    
    public String getPicture() {
        return this.picture;
    }

    public CountryName getName() {
        return this.name;
    }

    // Setters
    public void setCode(String code) {
        this.code = code;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setName(CountryName name) {
        this.name = name;
    }

}
