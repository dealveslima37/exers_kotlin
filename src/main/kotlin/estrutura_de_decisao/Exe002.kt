package estrutura_de_decisao

import java.util.Scanner

/*
    Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
 */

fun main() {

    val scanner = Scanner(System.`in`)

    try {
        print("Digite um valor inteiro: ")
        val numero = scanner.nextInt()
        val resultado: String = if(numero > 0) "Positivo" else "Negativo"

        println("O número $numero é $resultado")
    }catch (e : Exception){
        println("Refaça a operação digitando números válidos")
    }

    scanner.close()
}