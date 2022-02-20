package estrutura_de_decisao

import java.util.Scanner

/*
    Faça um Programa que verifique se uma letra digitada é vogal ou consoante
 */

fun main() {

    val scanner = Scanner(System.`in`)

    try {
        print("Digite uma letra: ")
        val letra = scanner.next().substring(0,1).uppercase()

        when(letra){
            "A", "E", "I", "O", "U" -> println("A letra $letra é uma Vogal")
            else -> println("A letra $letra é uma Consoante")
        }

    }catch (e : Exception){
        println("Refaça a operação digitando valores válidos")
    }


    scanner.close()
}