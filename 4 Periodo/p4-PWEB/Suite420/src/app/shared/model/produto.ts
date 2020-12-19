export class Produto {
  id?: number;
  nome?: string;
  descricao?: string;
  preco?: number;
  imagem?: string;

  constructor(id?: number, produtos: Produto = {}) {
    this.id = id;
    this.nome = produtos.nome;
    this.descricao = produtos.descricao;
    this.preco = produtos.preco;
    this.imagem = produtos.imagem;
  }
}
