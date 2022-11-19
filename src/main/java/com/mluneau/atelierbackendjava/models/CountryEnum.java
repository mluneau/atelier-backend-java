package com.mluneau.atelierbackendjava.models;

enum CountryName {

    SER ("Serbia"),
    USA ("United States of America"),
    ESP ("Spain"),
    SUI ("Switzerland");

    private String name;

    CountryName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
