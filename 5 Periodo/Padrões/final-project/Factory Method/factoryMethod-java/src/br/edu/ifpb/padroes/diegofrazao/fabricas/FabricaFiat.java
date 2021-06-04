package br.edu.ifpb.padroes.diegofrazao.fabricas;

import br.edu.ifpb.padroes.diegofrazao.carros.Carro;
import br.edu.ifpb.padroes.diegofrazao.carros.Palio;

public class FabricaFiat implements FabricaDeCarro {
    @Override
    public Carro criarCarro() {
        return new Palio();
    }
}
