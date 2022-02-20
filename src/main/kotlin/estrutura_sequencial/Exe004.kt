package estrutura_sequencial

import java.lang.Exception
import java.util.*

/*
    Faça um Programa que peça as 4 notas bimestrais e mostre a média.
 */

fun main() {

    val scanner = Scanner(System.`in`)

    try {
        println("Digite as 4 notas bimetrais")
        val nota1 = scanner.nextDouble()
        val nota2 = scanner.nextDouble()
        val nota3 = scanner.nextDouble()
        val nota4 = scanner.nextDouble()

        val media = (nota1 + nota2 + nota3 + nota4) / 4;

        println("A média das notas = $media")
    }catch (e : Exception){
        println("Refaça a operação digitando números válidos")
    }

    scanner.close()
}