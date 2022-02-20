package estrutura_sequencial

import java.util.*

/*
    Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
 */

fun main() {

    Locale.setDefault(Locale.US)
    var scanner = Scanner(System.`in`)

    try {
        print("Lado do quadrado: ")
        val lado = scanner.nextDouble();
        val area = lado * lado;

        println("Área ${area * 2}")
    }catch (e : Exception){
        println("Digite um número válido")
    }

    scanner.close()
}