package com.mluneau.atelierbackendjava.models;

public class Data {

    private Integer rank;
    private Integer points;
    private Integer weight;
    private Integer height;
    private Integer age;
    private Integer[] last;

    // Constructor
    public Data() {}

    // Getters
    public Integer getRank() {
        return this.rank;
    }
    
    public Integer getWeight() {
        return this.weight;
    }
    
    public Integer getHeight() {
        return this.height;
    }

    public Integer getAge() {
        return this.age;
    }

    public Integer[] getLast() {
        return this.last;
    }

    // Settters
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setLast(Integer[] last) {
        this.last = last;
    }

}