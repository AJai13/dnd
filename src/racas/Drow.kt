package racas
import Personagem
import iRacas

class Drow : iRacas {
    override val nome = "Drow"

    override fun aplicarBonus(personagem: Personagem) {
        personagem.destreza += 2
        personagem.carisma += 1
    }
}