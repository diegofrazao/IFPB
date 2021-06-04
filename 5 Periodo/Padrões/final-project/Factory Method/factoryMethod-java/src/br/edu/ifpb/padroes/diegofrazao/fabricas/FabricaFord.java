package br.edu.ifpb.padroes.diegofrazao.fabricas;

import br.edu.ifpb.padroes.diegofrazao.carros.Carro;
import br.edu.ifpb.padroes.diegofrazao.carros.Fiesta;

public class FabricaFord implements FabricaDeCarro {
    @Override
    public Carro criarCarro() {
        return new Fiesta();
    }
}
