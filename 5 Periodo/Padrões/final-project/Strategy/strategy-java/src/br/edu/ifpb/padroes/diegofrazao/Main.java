package br.edu.ifpb.padroes.diegofrazao;

import br.edu.ifpb.padroes.diegofrazao.exercicios.Correr;
import br.edu.ifpb.padroes.diegofrazao.exercicios.Futebol;
import br.edu.ifpb.padroes.diegofrazao.exercicios.Musculacao;
import br.edu.ifpb.padroes.diegofrazao.modelo.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa;
        pessoa = new Pessoa("Frazao", new Futebol());
        pessoa.exercitar();
    }
}
