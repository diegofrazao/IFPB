import { Carro } from './Carro'

export class Palio implements Carro {

	public exibirInfo() {
		console.log('Modelo: Palio\nFabricante: Fiat');
	}

}