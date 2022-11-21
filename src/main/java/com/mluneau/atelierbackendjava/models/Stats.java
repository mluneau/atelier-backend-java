package com.mluneau.atelierbackendjava.models;

public class Stats {
    
    private double meanBMI;
    private int medianHeight;
    private String highestCountryWinrate;

    // Constructor 
    public Stats() {}


    // Getters and Setters
    public String getHighestCountryWinrate() {
        return highestCountryWinrate;
    }

    public double getMeanBMI() {
        return meanBMI;
    }

    public int getMedianHeight() {
        return medianHeight;
    }

    public void setHighestCountryWinrate(String highestCountryWinrate) {
        this.highestCountryWinrate = highestCountryWinrate;
    }

    public void setMeanBMI(double meanBMI) {
        this.meanBMI = meanBMI;
    }

    public void setMedianHeight(int medianHeight) {
        this.medianHeight = medianHeight;
    }
}
