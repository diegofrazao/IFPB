package br.edu.ifpb.padroes.diegofrazao;

import br.edu.ifpb.padroes.diegofrazao.carros.Carro;
import br.edu.ifpb.padroes.diegofrazao.fabricas.*;

public class Main {
    public static void main(String[] args) {
        FabricaDeCarro fabrica = new FabricaFiat();
        Carro carro = fabrica.criarCarro();
        carro.exibirInfo();
        System.out.println();

        fabrica = new FabricaWolks();
        carro = fabrica.criarCarro();
        carro.exibirInfo();
        System.out.println();

        fabrica = new FabricaFord();
        carro = fabrica.criarCarro();
        carro.exibirInfo();
        System.out.println();

        fabrica = new FabricaChevrolet();
        carro = fabrica.criarCarro();
        carro.exibirInfo();
    }
}
