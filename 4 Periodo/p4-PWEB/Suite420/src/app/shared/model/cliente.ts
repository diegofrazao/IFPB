export class Cliente {
  id?: number;
  nome?: string;
  cpf?: string;
  endereco?: string;
  telefone?: string;

  constructor(id?: number, clientes: Cliente = {}) {
    this.id = id;
    this.nome = clientes.nome;
    this.cpf = clientes.cpf;
    this.endereco = clientes.endereco;
    this.telefone = clientes.telefone;
  }
}
