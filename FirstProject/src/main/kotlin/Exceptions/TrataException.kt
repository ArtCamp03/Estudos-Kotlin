package Exceptions

import java.io.BufferedReader
import java.io.File
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException
import java.io.FileReader as FileReader

// mport java.lang.IllegalArgumentException

fun main(){
    // val porcentagem = porcentagem(101)
    // println(porcentagem)

    val idade = LerIdade()
    println(idade)
}

/*
fun porcentagem(numero: Int): String{
    return if(numero in 1..100){
        "$numero%"
    }else{
        throw IllegalArgumentException("$numero deve estar entre 1 e 100 ")
    }

}

 */

fun LerIdade(): String {
    val reader = FileReader(File("src/idade.txt"))
    val buffer = BufferedReader(reader)

    return try {
        val numero = buffer.readLine()
        Integer.parseInt(numero)
    } catch (e: NumberFormatException ){
        return "ERRO"
    }finally {
        buffer.close()
    }
}

