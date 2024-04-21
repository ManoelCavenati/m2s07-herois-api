package com.senai.m2s07herois.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.m2s07herois.model.Heroi;
import com.senai.m2s07herois.repository.HeroiRepository;

@Service
public class HeroiSevice {

    @Autowired
    private HeroiRepository heroiRepository;

    public Heroi inserir(Heroi heroi) {

        heroiRepository.adicionar(heroi);
        return heroi;

    }

    public List<Heroi> consultar() {
        return heroiRepository.consultar();
    }

}
