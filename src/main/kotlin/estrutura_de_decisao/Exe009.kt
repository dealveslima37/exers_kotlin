package estrutura_de_decisao

import java.util.*

/*
    Faça um Programa que leia três números e mostre-os em ordem decrescente.
 */

fun main() {

    Locale.setDefault(Locale.US)
    val scanner = Scanner(System.`in`)

    try {
        println("Digite três números inteiros")
        val a = scanner.nextInt()
        val b = scanner.nextInt()
        val c = scanner.nextInt()

        if(a >= b && b >= c){
            println("$a, $b, $c")
        }else if(a >= c && c >= b){
            println("$a, $c, $b")
        }else if(b >= a && a >= c){
            println("$b, $a, $c")
        }else if(b >= c  && c >= a){
            println("$b, $c, $a")
        }else if(c >= a && a >= b){
            println("$c, $a, $b")
        }else if(c >= b && b >= a){
            println("$c, $b, $a")
        }

    }catch (e : Exception){
        println("Refaça a operação digitando valores válidos")
    }

    scanner.close()
}