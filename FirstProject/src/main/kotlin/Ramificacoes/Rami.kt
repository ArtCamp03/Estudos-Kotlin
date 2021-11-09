package Ramificacoes

// (1 + 2) + 4
interface  Expressao
class Numero(val valor: Int): Expressao
class Soma(val direito: Expressao, val esquerdo: Expressao): Expressao

fun avaliacao(expressao: Expressao): Int =
    when(expressao){
        is Numero -> {
            println("Expressao com numero: ${expressao.valor}")
            expressao.valor
        }
        is Soma -> {
            println("Soma das expressoes: ")
            avaliacao(expressao.esquerdo) + avaliacao(expressao.direito)
        }
        else -> throw IllegalAccessException("Expressao desconhecida")
    }

fun main(){
    // (1 + 2) + 4
    val resultado = avaliacao(Soma(Soma(Numero(1), Numero(2)), Numero(4)))
    println(resultado)
}