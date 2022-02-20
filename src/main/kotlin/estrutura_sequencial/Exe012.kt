package estrutura_sequencial

import java.util.Locale
import java.util.Scanner

/*
    Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal,
    usando a seguinte fórmula: (72.7*altura) - 58
 */

fun main() {

    Locale.setDefault(Locale.US)
    val scanner = Scanner(System.`in`)

    try {
        print("Altura: ")
        val altura = scanner.nextDouble()
        val pesoIdeal = (72.7 * altura) - 58

        print("Peso ideal: ${String.format("%.2f", pesoIdeal)}")
    }catch (e : Exception){
        print("Refaça a operação digitando valores corretos")
    }

    scanner.close()
}