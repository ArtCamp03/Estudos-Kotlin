// Na linguagem Kotlin a maioria das condiçoes sao inserridas em expressoes e nao em declaraçoes, declaraçoes sao apenas os loops(for,do ,doqwhile)

fun main(){
    println("Ola mundo em Kotlin")

    // result max
    println("Max1: ")
    println(max(12,20))

    // result max2
    println("Max2: ")
    println(max2(10,20))

    // result max3
    println("Max3: ")
    println(max3(20,20))
}

// Corpo de bloco
fun max(a: Int, b: Int) : Int {
    return if(a>b) a else b
}

// corpo de expressao (utilziada em casos simples, com somente uma expressao)
fun max2(a: Int, b: Int) :Int = if(a>b) a else b

// corpo de expressao simplificando omitindo tipo de retorno
fun max3(a: Int, b: Int)  = if(a>b) a else b