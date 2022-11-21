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

    @GetMapping(path="/")
    public String welcomeMessage() throws IOException {
        return "Welcome to this API which returns Tennis player statistics!"
        + "<br>Please try reaching the following endpoints:"
        + "<br>/api/v1/players"
        + "<br>/api/v1/players/{id}" + "<span><i>Tip: look at a player id on the previous endpoint.</i>"
        + "<br>/api/v1/stats";
    }

    @GetMapping(path = "/api/v1/players")
    public ArrayList<Player> getPlayersByRank() throws IOException {
        return PlayerServices.getPlayers();
    }

    @GetMapping(path = "api/v1/players/{id}")
    public Player getPlayer(@PathVariable int id) throws IOException {
        return PlayerServices.getPlayer(id);
    }
    
    
}
