import { ExercicioFavorito } from './ExercicioFavorito'

export class Musculacao implements ExercicioFavorito {
  public comecar(): void {
    console.log('Fazer musculação na academia')
  }
}