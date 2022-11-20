package com.mluneau.atelierbackendjava.controllers;

import com.mluneau.atelierbackendjava.services.*;
import com.mluneau.atelierbackendjava.models.*;

import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RequestMapping(path = "/api/v1/players")
public class PlayerController {

    @GetMapping
    public List<Player> getPlayersByRank() throws IOException {
        return PlayerServices.getPlayers();
    }
    
}
