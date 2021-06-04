package br.edu.ifpb.padroes.diegofrazao.fabricas;

import br.edu.ifpb.padroes.diegofrazao.carros.Carro;
import br.edu.ifpb.padroes.diegofrazao.carros.Celta;

public class FabricaChevrolet implements FabricaDeCarro {
    @Override
    public Carro criarCarro() {
        return new Celta();
    }
}
