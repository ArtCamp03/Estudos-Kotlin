package OperadorIn

fun main(){
    println(inLetter('a'))
    println(inLetter('x'))

}

fun inLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNotDigit(c: Char) = c !in '0'..'9'


