package br.edu.ifpb.padroes.diegofrazao.modelo;

import br.edu.ifpb.padroes.diegofrazao.exercicios.ExercicioFavorito;

public class Pessoa {
    private String nome;
    private ExercicioFavorito exercicioFavorito;

    public Pessoa(String nome, ExercicioFavorito exercicioFavorito) {
        this.nome = nome;
        this.exercicioFavorito = exercicioFavorito;
    }

    public void exercitar() {
        System.out.print(this.nome + " decidiu: " + this.exercicioFavorito.comecar());
    }
}
