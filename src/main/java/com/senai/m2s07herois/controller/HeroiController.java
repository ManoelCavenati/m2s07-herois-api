package com.senai.m2s07herois.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.m2s07herois.model.Heroi;
import com.senai.m2s07herois.service.HeroiSevice;

@RestController
@RequestMapping("herois")
public class HeroiController {

    @Autowired
    private HeroiSevice heroiService;

    @PostMapping
    public ResponseEntity<Heroi> cadastrar(@RequestBody Heroi heroi) {
        heroi = heroiService.inserir(heroi);
        return ResponseEntity.created(URI.create(heroi.getNome())).body(heroi);
    }

    @GetMapping
    public ResponseEntity<List<Heroi>> listar() {
        var herois = heroiService.consultar();
        return ResponseEntity.ok().body(herois);
    }

}
