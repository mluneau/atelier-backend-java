package com.mluneau.atelierbackendjava.services;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mluneau.atelierbackendjava.models.Player;


@Service
public class PlayerServices {

    // Return the list of all players by Highest Rank
    public static ArrayList<Player> getPlayers() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        File playersJsonfile = new File("src/main/resources/static/headtohead.json");
        
        ArrayList<Player> players = (ArrayList<Player>) objectMapper.readValue(playersJsonfile, new TypeReference<ArrayList<Player>>() {});
        Collections.sort(players);
        return players;
    }

    // Return an instance of Player by getting the Id from url
    public static Player getPlayer(int id) throws IOException {
        for (Player player : getPlayers()) {
            if (player.getId() == (id)) {
                System.out.println(player);
                return player;
            }
        }
        return null;
    }
    
}
