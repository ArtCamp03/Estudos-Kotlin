package AcessoresCustomizadas

class Retangulo (val altura: Int,val largura: Int){
    val isQuadrado: Boolean
    // acessor customizado
    // nao necessita de um campo pra guardar seu valor
    get(){
        return altura == largura
    }

    /*
    Acessor customizado
        get() = altuara == largura
     */

}

fun main(){
    val retangulo: Retangulo = Retangulo(10,20)
    println(retangulo.isQuadrado)
}