package estrutura_sequencial

import java.util.*

/*
    Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
C = 5 * ((F-32) / 9).
 */

fun main() {
    Locale.setDefault(Locale.US)
    var scanner = Scanner(System.`in`)

    try {
        print("Digite a temperatura em Fahrenheit: ")
        val fahrenheit = scanner.nextDouble()
        var celsius = 5 * ((fahrenheit - 32) / 9)

        println("Temperatura em celsius $celsius")
    }catch (e: Exception){
        println("Informe um valor válido")
    }

    scanner.close()
}