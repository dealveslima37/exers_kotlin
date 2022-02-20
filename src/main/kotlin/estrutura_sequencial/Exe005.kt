package estrutura_sequencial

import java.util.*

/*
    Faça um Programa que converta metros para centímetros.
 */

fun main() {

    Locale.setDefault(Locale.US)
    var scanner = Scanner(System.`in`)

    try {
        print("Informe o valor em metros: ")
        val metros = scanner.nextDouble()
        val cms = metros * 100

        println("$metros metros equivalem a $cms centímetros")
    }catch (e : Exception){
        println("Digite um número válido")
    }

    scanner.close()
}