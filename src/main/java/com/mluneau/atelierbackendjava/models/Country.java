package com.mluneau.atelierbackendjava.models;

public class Country {

    private String code;
    private String picture;
    private CountryName name;

    // Constructor
    public Country() {}

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
