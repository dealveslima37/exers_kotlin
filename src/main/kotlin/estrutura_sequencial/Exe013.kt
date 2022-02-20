package estrutura_sequencial

import java.util.*

/*
    Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal,
    utilizando as seguintes fórmulas:
        a. Para homens: (72.7*h) - 58
        b. Para mulheres: (62.1*h) - 44.7
 */

fun main() {
    Locale.setDefault(Locale.US)
    val scanner = Scanner(System.`in`)

    try {
        print("Altura: ")
        val altura = scanner.nextDouble()
        val pesoIdealHomem = (72.7 * altura) - 58
        val pesoIdealMulheres = (62.1 * altura) - 44.7

        println("Peso ideal Homens ${String.format("%.2f", pesoIdealHomem)}")
        println("Peso ideal Mulheres ${String.format("%.2f", pesoIdealMulheres)}")
    }catch (e : Exception){
        print("Refaça a operação digitando valores válidos")
    }

}