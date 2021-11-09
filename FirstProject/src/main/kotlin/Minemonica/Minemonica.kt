package Minemonica

fun obterMinemonmica(cor: Cor) =
    when (cor) {
        Cor.VERMELHO -> "Ver"
        Cor.AMARELO -> "Alguem"
        Cor.VERDE -> "Viver "
        Cor.AZUL -> "Alem e"
        Cor.LARANJA -> "Legal"
    }

fun main(){
    val minemonica = obterMinemonmica(Cor.VERMELHO)
    println(minemonica)
}