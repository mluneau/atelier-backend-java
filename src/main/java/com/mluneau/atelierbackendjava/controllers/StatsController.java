package com.mluneau.atelierbackendjava.controllers;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mluneau.atelierbackendjava.models.*;
import com.mluneau.atelierbackendjava.services.*;

@RestController
@RequestMapping
public class StatsController {

    @GetMapping(path = "/api/v1/stats")
    public Stats getStats() throws IOException {
        return StatsServices.getStats();
    }
    
}
