package estrutura_sequencial

import java.util.Locale
import java.util.Scanner

/*
    Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
 */

fun main() {

    Locale.setDefault(Locale.US)
    val scanner = Scanner(System.`in`)

    try {
        print("Temperatura em celsius: ")
        val celsius = scanner.nextDouble()
        val fahrenheit = celsius * 1.8 + 32

        println("$celsius Celsius equivalem a $fahrenheit Fahrenheit")
    }catch (e : Exception){
        print("Informe um número válido")
    }

    scanner.close()
}