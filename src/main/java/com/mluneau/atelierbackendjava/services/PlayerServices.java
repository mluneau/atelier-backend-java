package com.mluneau.atelierbackendjava.services;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mluneau.atelierbackendjava.models.Player;


@Service
public class PlayerServices {
    
    public static ArrayList<Player> getPlayers() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        File playersJsonfile = new File("src/main/resources/static/headtohead.json");
        
        ArrayList<Player> players = (ArrayList<Player>) objectMapper.readValue(playersJsonfile, new TypeReference<ArrayList<Player>>() {});
        for (Player player: players) {
            System.out.println(player.getData().getRank());
        }
        Collections.sort(players);
        return players;
    }

}
