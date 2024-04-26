package com.senai.m2s07herois.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "herois")
public class Heroi {

    @Id
    @Column(length = 20, nullable = false)
    private String nome;

    @Column(length = 40, nullable = false)
    private String superpoder;

    @Column(nullable = true)
    private Integer idade;

    @Column(length = 100, nullable = false)
    private String cidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSuperpoder() {
        return superpoder;
    }

    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

}
