package Exceptions

import java.lang.IllegalArgumentException

fun main(){
    val porcentagem = porcentagem(101)
    println(porcentagem)
}

fun porcentagem(numero: Int): String{
    return if(numero in 1..100){
        "$numero%"
    }else{
        throw IllegalArgumentException("$numero deve estar entre 1 e 100 ")
    }

}

/*
fun LerIdade(): Int{

}

 */