fun main(){

    // Formataçao de strings mais facil

    // com tipo da variavel
    //val nome:String = "Artur"

    // omitindo tipo da variavel
    val nome = "Artur"

    println("Hello " + nome + "!")

    // utilizando template
    // barra invertida anula o string template  ( \ )
    println("Hello $nome!")

    println("A soma eh: ${soma(10,20)}")
}

fun soma(a:Int, b:Int): Int {
    return a + b
}