package com.mluneau.atelierbackendjava.services;

import java.io.IOException;
import java.util.ArrayList;

import com.mluneau.atelierbackendjava.models.*;

public class StatsServices {

    public static Stats getStats() throws IOException {

        ArrayList<Player> players = PlayerServices.getPlayers();
        
        Stats stats = new Stats();
        stats.setMedianHeight(StatsCalculation.calculateMedianHeight(players));
        stats.setHighestCountryWinrate(StatsCalculation.calculateHighestCountryWinrate(players));
        stats.setMeanBMI(StatsCalculation.calculateMeanBMI(players));
        return stats;
    }

}
