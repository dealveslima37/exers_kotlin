package estrutura_sequencial

/*
    Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
 */

import java.lang.Exception
import java.util.*

fun main() {

    var scanner = Scanner(System.`in`)

    try {
        print("Digite um número inteiro: ")
        var numero = scanner.nextInt();

        println("Número digitado " + numero)

    }catch (e: Exception){
        print("Refaça a operação digitando umnúmero interiro")
    }


    scanner.close()
}