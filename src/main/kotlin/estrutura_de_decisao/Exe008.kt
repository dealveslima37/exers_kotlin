package estrutura_de_decisao

import java.util.*

/*
    Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar,
    sabendo que a decisão é sempre pelo mais barato.
 */

fun main() {

    Locale.setDefault(Locale.US)
    val scanner = Scanner(System.`in`)

    try {

        println("Digite o valor de três produtos")
        var p1 = scanner.nextDouble()
        var p2 = scanner.nextDouble()
        var p3 = scanner.nextDouble()

        if(p1 <= p2 && p1 <= p3){
            println("Produto a comprar $p1")
        }else if(p2 <= p1 && p2 <= p3){
            println("Produto a comprar $p2")
        }else if(p3 <= p1 && p3 <= p2){
            println("Produto a comprar $p3")
        }

    }catch (e : Exception){
        println("Refaça a operação digitando valores válidos")
    }

    scanner.close()
}