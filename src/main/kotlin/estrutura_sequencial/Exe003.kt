package estrutura_sequencial

import java.lang.Exception
import java.util.*

/*
    Faça um Programa que peça dois números e imprima a soma.
 */

fun main() {

    var scanner = Scanner(System.`in`)

    try {
        println("Digite dois número inteiros")
        var n1 = scanner.nextInt();
        var n2 = scanner.nextInt();
        var soma = n1 + n2;

        print("A soma de $n1 + $n2 = $soma")
    }catch (e : Exception){
        println("Refaça a operação digitando dois númneros inteiros")
    }


    scanner.close()
}