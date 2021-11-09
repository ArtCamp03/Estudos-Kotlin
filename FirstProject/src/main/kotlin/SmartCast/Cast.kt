package SmartCast

// (1 + 2) + 4
interface  Rxpressao
class Numero(val valor: Int): Rxpressao
class Soma(val direito: Rxpressao, val esquerdo: Rxpressao): Rxpressao

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