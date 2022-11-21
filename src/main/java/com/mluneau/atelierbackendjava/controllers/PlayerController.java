package com.mluneau.atelierbackendjava.controllers;

import com.mluneau.atelierbackendjava.services.*;
import com.mluneau.atelierbackendjava.models.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.IOException;
import java.util.ArrayList;


@RestController
@RequestMapping
public class PlayerController {

    @GetMapping(path = "/api/v1/players")
    public ArrayList<Player> getPlayersByRank() throws IOException {
        return PlayerServices.getPlayers();
    }

    @GetMapping(path = "api/v1/players/{id}")
    public Player getPlayer(@PathVariable int id) throws IOException {
        return PlayerServices.getPlayer(id);
    }
    
    
}
