import { Carro } from './carros/Carro'
import { FabricaDeCarro } from './fabricas/FabricaDeCarro'
import { FabricaFiat } from './fabricas/FabricaFiat'
import { FabricaWolks } from './fabricas/FabricaWolks'
import { FabricaFord } from './fabricas/FabricaFord'
import { FabricaChevrolet } from './fabricas/FabricaChevrolet'

var fabrica: FabricaDeCarro;
var carro: Carro;

fabrica = new FabricaFiat();

carro = fabrica.criarCarro();
carro.exibirInfo();
console.log();

fabrica = new FabricaWolks();
carro = fabrica.criarCarro();
carro.exibirInfo();
console.log();

fabrica = new FabricaFord();
carro = fabrica.criarCarro();
carro.exibirInfo();
console.log();

fabrica = new FabricaChevrolet();
carro = fabrica.criarCarro();
carro.exibirInfo();
