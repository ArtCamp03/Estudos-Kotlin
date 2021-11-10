package Collections

fun main(){
    // ArrayList classe

    val fruta1 = ArrayList<String>()
    fruta1.add("Mamao")
    fruta1.add("abacaxi")
    fruta1.add("morango")
    fruta1.add("banana")
    println(fruta1)

    // utilizando funcao
    val fruta2 =  arrayListOf("Laranja", "Morango", "Banana")
    println(fruta2.last())

    val numeros = setOf(1, 145, 2)
    println(numeros)
}