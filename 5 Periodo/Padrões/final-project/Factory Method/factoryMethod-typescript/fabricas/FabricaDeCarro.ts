import { Carro } from '../carros/Carro'

export abstract class FabricaDeCarro {
  public abstract criarCarro(): Carro;
}