import { Carro } from '../carros/Carro'
import { Fiesta } from '../carros/Fiesta'
import { FabricaDeCarro } from './FabricaDeCarro'

export class FabricaFord extends FabricaDeCarro {

	public criarCarro(): Carro {
		return new Fiesta();
	}

}