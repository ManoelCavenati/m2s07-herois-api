package com.senai.m2s07herois.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.m2s07herois.model.Heroi;

@Repository
public interface HeroiRepository extends JpaRepository<Heroi, String> {

} // HeroiRepository {

// private List<Heroi> lista = new ArrayList<>();

// public void adicionar(Heroi heroi) {

// lista.add(heroi);

// }

// public List<Heroi> consultar() {
// return lista;
// }
