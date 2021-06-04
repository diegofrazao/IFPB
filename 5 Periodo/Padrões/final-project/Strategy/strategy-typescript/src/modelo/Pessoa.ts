import {ExercicioFavorito} from "../exercicios/ExercicioFavorito"

export class Pessoa {
  public nome: String;
  public exercicioFavorito: ExercicioFavorito;

  constructor(nome: string, exercicioFavorito: ExercicioFavorito) {
    this.nome = nome;
    this.exercicioFavorito = exercicioFavorito;
  }

  exercitar(): void {
    console.log(`${ this.nome } decidiu: `);
    this.exercicioFavorito.comecar();
  }

}