package com.mluneau.atelierbackendjava.services;

import com.mluneau.atelierbackendjava.models.*;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
public class PlayerServices {
    
    public static List<Player> getPlayers() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        File playersJsonfile = new File("src/main/resources/headtohead.json");
        List<Player> players = objectMapper.readValue(playersJsonfile, new TypeReference<List<Player>>() {});    
        return players;
    }

}
