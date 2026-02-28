package com.backlog.app.controllers;

import com.backlog.app.models.Game;
import com.backlog.app.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

    @Autowired
    private GameRepository gameRepository;

    @GetMapping("/test-add")
    public String testAdd() {
        Game g = new Game();
        g.setTitle("The Witcher 3");
        g.setStatus("BACKLOG");
        gameRepository.save(g);
        return "Siker! Nézd meg a Supabase-t!";
    }
}