package SmartCast

// (1 + 2) + 4
interface  Expressao
class Numero(val valor: Int): Expressao
class Soma(val direito: Expressao, val esquerdo: Expressao): Expressao

fun avaliacao(expressao: Expressao): Int{
    if(expressao is Numero){
        // metodo explicito
        //val numero = expressao as Numero
        return expressao.valor
    }

    if(expressao is Soma){
        return avaliacao(expressao.esquerdo) + avaliacao(expressao.direito)
    }

    throw IllegalAccessException("Expressao desconhecida")
}

fun main(){
    // (1 + 2) + 4
    val resultado = avaliacao(Soma(Soma(Numero(1), Numero(2)), Numero(4)))
    println(resultado)
}