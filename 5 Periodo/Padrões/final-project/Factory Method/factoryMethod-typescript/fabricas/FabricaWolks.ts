import { Carro } from '../carros/Carro'
import { Gol } from '../carros/Gol'
import { FabricaDeCarro } from './FabricaDeCarro'

export class FabricaWolks extends FabricaDeCarro {

	public criarCarro(): Carro {
		return new Gol();
	}

}