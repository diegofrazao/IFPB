import { ExercicioFavorito } from './ExercicioFavorito'

export class Correr implements ExercicioFavorito {
  public comecar(): void {
    console.log('Correr uma maratona')
  }
}