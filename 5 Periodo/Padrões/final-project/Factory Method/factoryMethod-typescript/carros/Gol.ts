import { Carro } from './Carro'

export class Gol implements Carro {

	public exibirInfo() {
		console.log('Modelo: Gol\nFabricante: Volkswagen');
	}

}