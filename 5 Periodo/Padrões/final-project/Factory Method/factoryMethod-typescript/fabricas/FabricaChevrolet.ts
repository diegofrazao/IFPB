import { Carro } from '../carros/Carro'
import { Celta } from '../carros/Celta'
import { FabricaDeCarro } from './FabricaDeCarro'

export class FabricaChevrolet extends FabricaDeCarro {

	public criarCarro(): Carro {
		return new Celta();
	}

}