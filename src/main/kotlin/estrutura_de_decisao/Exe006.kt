package estrutura_de_decisao

import java.util.*

/*
    Faça um Programa que leia três números e mostre o maior deles.
 */

fun main() {

    Locale.setDefault(Locale.US)
    val scanner = Scanner(System.`in`)

    try {
        println("Digite 3 números inteiros")
        val n1 = scanner.nextInt()
        val n2 = scanner.nextInt()
        val n3 = scanner.nextInt()

        if (n1 > n2 && n1 > n3){
            println("O maior número é $n1")
        }else if(n2 > n1 && n2 > n3){
            print("O maior número é $n2")
        }else if(n3 > n1 && n3 > n2){
            println("O maior número é $n3")
        }else{
            println("Os números digitados são iguais")
        }

    }catch (e: Exception){
        println("Refaça a operação digitando valores válidos")
    }

    scanner.close()
}