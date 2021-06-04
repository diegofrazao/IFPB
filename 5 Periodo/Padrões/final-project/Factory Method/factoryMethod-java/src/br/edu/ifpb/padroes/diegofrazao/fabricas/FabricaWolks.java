package br.edu.ifpb.padroes.diegofrazao.fabricas;

import br.edu.ifpb.padroes.diegofrazao.carros.Carro;
import br.edu.ifpb.padroes.diegofrazao.carros.Gol;

public class FabricaWolks implements FabricaDeCarro {
    @Override
    public Carro criarCarro() {
        return new Gol();
    }
}
