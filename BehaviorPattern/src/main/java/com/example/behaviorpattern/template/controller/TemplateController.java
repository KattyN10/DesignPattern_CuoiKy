package com.example.behaviorpattern.template.controller;

import com.example.behaviorpattern.template.template.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/template")
public class TemplateController {

    @Autowired
    @Qualifier("cricket")
    Game gameCricket;

    @Autowired
    @Qualifier("football")
    Game gameFootball;

    @GetMapping
    public ResponseEntity getTemplate() {

        System.out.println("============cricket==============");
        gameCricket.play();
        System.out.println("============football=============");
        gameFootball.play();

        return ResponseEntity.noContent().build();
    }

}
