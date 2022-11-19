package com.mluneau.atelierbackendjava.models;


public class Data {

    private Integer rank;
    private Integer points;
    private Integer weight;
    private Integer height;
    private Integer age;
    private Integer[] last;

    // Constructors
    public Data(Integer rank, Integer points, Integer weight, Integer height, Integer age, Integer[] last) {
        this.rank = rank;
        this.points = points;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.last = last;
    }

    public Data(Data source) {
        this.rank = source.rank;
        this.points = source.points;
        this.weight = source.weight;
        this.height = source.height;
        this.age = source.age;
        this.last = source.last;
    }

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

    public void setpoints(Integer points) {
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