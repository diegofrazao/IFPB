import { Carro } from '../carros/Carro'
import { Palio } from '../carros/Palio'
import { FabricaDeCarro } from './FabricaDeCarro'

export class FabricaFiat extends FabricaDeCarro {

	public criarCarro(): Carro {
		return new Palio();
	}

}