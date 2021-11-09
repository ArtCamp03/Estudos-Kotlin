package Lacos

// crie um programa que calcule e exiba o resultado da media de temperaturas informada pelo usuario
fun main(){
    var temperatura: Int = 0
    var somatorio: Int = 0
    var quantidade: Int =0

    while(temperatura != 999){
        println("Digite uma temperatura ou 999 para sair: ")
        temperatura = readLine()!!.toInt()

        if(temperatura != 999){
            somatorio += temperatura    // somatorio = somatorio + temperatura
            quantidade++ // quantidade = quantidade + 1
        }
    }

    println("A medida das temperaturas eh = ${somatorio/quantidade}")
}