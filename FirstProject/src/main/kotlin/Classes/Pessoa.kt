package Classes

class Pessoa(
    val nome: String,
    val idade: Int

    )

// instanciar classe
fun main(){
    val pessoa:Pessoa = Pessoa("Kleber",40)
    val pessoa1:Pessoa = Pessoa("Joao",50)
    val pessoa2:Pessoa = Pessoa("Maria",60)

    println("Pessoa: ${pessoa.nome} ${pessoa.idade}")
    println("Pessoa1: ${pessoa1.nome}")
    println("Pessoa2: ${pessoa2.nome}")

}


