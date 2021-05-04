class Forca {
  let dic = ["acer", "electrolux", "dell", "philips", "sony"]
  var keyWord: String

  init() {
    keyWord = dic[Int.random(in: 0...dic.count-1)]
  }

  func initGame() {
    var attempts = [Character]()
    var finalGame = 10
    var boardGame = self.boardGame()

    repeat {
      print("a palavra secreta contém \(keyWord.count) letras")
      print("restam \(finalGame) tentativas: \(attempts)")
      print("palavra secreta: \(boardGame)")
      print("Digite uma letra: ")

      if let hint = readLine() {
        let character = Character(hint.lowercased())

        if (attempts.contains(character)) {
          print("Essa letra já foi usada.")
        }

        attempts.append(character)

        if(self.keyWord.contains(character)) {
          boardGame = insertLetter(board: boardGame, letter: character)
          if(boardGame == keyWord) {
            print("\nvocê ganhou!")
            break
          }
        }

        finalGame -= 1

        if(finalGame == 0) {
          print("\nvocê perdeu!")
        }
      } else {
        print("tentativa invalida")
      }
    } while (finalGame > 0)
  }

  private func insertLetter(board: String, letter: Character) -> String {
    let splitKeyWord = Array(self.keyWord)
    var splitBoard = Array(board)
    for i in 0..<wordToArray.count {
      if (wordToArray[i] == letter) {
        spacesToArray[i] = letter
      }
    }
    return String(splitBoard)
  }

  private func boardGame() -> String {
    var board = ""
    for _ in 0..<self.keyWord.count {
      board += "_"
    }
    return board
  }
}

let game = Forca()
game.initGame()