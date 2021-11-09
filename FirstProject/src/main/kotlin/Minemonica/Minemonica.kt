package Minemonica

import Escolhas.Cor

fun obterMinemonmica(cor: Cor) =
    when (cor) {
        Cor.VERMELHO -> "Ver"
        Cor.AMARELO -> "Alguem"
        Cor.VERDE -> "Viver "
        Cor.AZUL -> "Alem e"
        Cor.LARANJA -> "Legal"
    }

fun obterTemperatura(cor: Cor): String{
    return when(cor){
        Cor.VERMELHO, Cor.LARANJA, Cor.AMARELO -> "Quente"
        Cor.VERDE -> "Neutro"
        Cor.AZUL -> "frio"
    }
}

fun main(){
    val minemonica = obterMinemonmica(Cor.VERMELHO)
    println("Frase: ")
    println(minemonica)

    val temperatura = obterTemperatura(Cor.VERMELHO)
    println("Temperatura cor: ")
    println(temperatura)

}