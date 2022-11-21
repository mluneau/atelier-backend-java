package com.mluneau.atelierbackendjava.models;

public class Data {

    private int rank;
    private int points;
    private int weight;
    private int height;
    private int age;
    private int[] last;

    // Constructor
    public Data() {}

    // Getters
    public int getRank() {
        return this.rank;
    }
    
    public int getPoints() {
        return this.points;
    }

    public int getWeight() {
        return this.weight;
    }
    
    public int getHeight() {
        return this.height;
    }

    public int getAge() {
        return this.age;
    }

    public int[] getLast() {
        return this.last;
    }

    // Settters
    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLast(int[] last) {
        this.last = last;
    }

}
