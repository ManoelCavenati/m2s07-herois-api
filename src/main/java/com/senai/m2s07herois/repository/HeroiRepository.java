package com.senai.m2s07herois.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.senai.m2s07herois.model.Heroi;

@Repository
public class HeroiRepository {

    private List<Heroi> lista = new ArrayList<>();

    public void adicionar(Heroi heroi) {

        lista.add(heroi);

    }

    public List<Heroi> consultar() {
        return lista;
    }

}
