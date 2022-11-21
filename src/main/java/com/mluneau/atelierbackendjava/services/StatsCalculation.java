package com.mluneau.atelierbackendjava.services;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

import com.mluneau.atelierbackendjava.models.*;

public class StatsCalculation {

    static DecimalFormat df = new DecimalFormat("#.##");     

    public static int calculateMedianHeight(ArrayList<Player> players) throws IOException {
        
        int[] heights = new int[players.size()];
        for (int i=0; i<players.size(); i++) {
            heights[i] = players.get(i).getData().getHeight(); 
        }
        
        Arrays.sort(heights);
        int middleIndex = Math.floorDiv(heights.length, 2);
        int medianHeight = (heights[middleIndex -1] + heights[middleIndex]) / 2;
        return medianHeight;
    }

    public static double calculateMeanBMI(ArrayList<Player> players) throws IOException {
        
        double[] bmis = new double[players.size()];
        double totalBMI = 0;
        for (int i=0; i<players.size(); i++) {
            double weightConversion = players.get(i).getData().getWeight()/1000;
            double heightConversion = (double)players.get(i).getData().getHeight()/100;
            bmis[i] = ((weightConversion) / Math.pow(heightConversion, 2));
            totalBMI += ((weightConversion) / Math.pow(heightConversion, 2));
        } 
        return Double.parseDouble(df.format(totalBMI/players.size()));
    }

    public static String calculateHighestCountryWinrate(ArrayList<Player> players) throws IOException {
        
        // Mapping the player ratios
        TreeMap<String, Double> ratios = new TreeMap<>();
        for (int i=0; i<players.size(); i++) {
            double win = 0;
            int[] last = players.get(i).getData().getLast();
            for (int j=0; j<last.length; j++) {
                if (last[j] == 1) {
                    win += 1;
                }
            }
            ratios.put(players.get(i).getShortname(), Double.parseDouble(df.format(win/last.length)));
            System.out.println(ratios);
        }
        
        /*  
        Need to implement logic for when countries have multiple players
        */

        // Getting the playerShortName with highest ratio
        String playerShortName = ratios.firstKey();
        String countryName= "";
        for (Player player: players) {
            if (player.getShortname().equals(playerShortName)) {
                countryName = player.getCountry().getCode();
            }
        } 
        return countryName;
    }
}
