package racas
import Personagem

class Humano : racas.iRacas {
    override val nome = "Humano"

    override fun aplicarBonus(personagem: Personagem) {
        personagem.forca += 1
        personagem.destreza += 1
        personagem.constituicao += 1
        personagem.inteligencia += 1
        personagem.sabedoria += 1
        personagem.carisma += 1
    }
}
