import { ExercicioFavorito } from './ExercicioFavorito'

export class Futebol implements ExercicioFavorito {
  public comecar(): void {
    console.log('Jogar futebol com os amigos')
  }
}