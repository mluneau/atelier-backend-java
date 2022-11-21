package com.mluneau.atelierbackendjava.controllers;

import com.mluneau.atelierbackendjava.services.*;
import com.mluneau.atelierbackendjava.models.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.util.ArrayList;


@RestController
@RequestMapping(path = "/api/v1/players")
public class PlayerController {

    @GetMapping
    public ArrayList<Player> getPlayersByRank() throws IOException {
        return PlayerServices.getPlayers();
    }

    
}
