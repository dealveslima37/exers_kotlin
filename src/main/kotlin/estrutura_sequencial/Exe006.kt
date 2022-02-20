package estrutura_sequencial

import java.util.*

/*
    Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
 */

fun main() {

    Locale.setDefault(Locale.US)
    val scanner = Scanner(System.`in`)

    try {
        print("Informe o valor do raio: ")
        val raio = scanner.nextDouble()
        var area = Math.PI * Math.pow(raio, 2.0)

        print("Área = $area")
    }catch (e: Exception){
        print("Digite um número válido")
    }

    scanner.close()
}