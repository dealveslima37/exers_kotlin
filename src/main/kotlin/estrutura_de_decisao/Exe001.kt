package estrutura_de_decisao

import java.util.Scanner

/*
    Faça um Programa que peça dois números e imprima o maior deles.
 */

fun main() {

    val scanner = Scanner(System.`in`)

    try {
        println("Digite dois números inteiros")
        val numero1 = scanner.nextInt()
        val numero2 = scanner.nextInt()
        val maiorNumero = if (numero1 > numero2) numero1 else numero2

        println("Maior número $maiorNumero")
    }catch (e : Exception){
        println("Refaça a operação digitando números válidos")
    }

    scanner.close()
}