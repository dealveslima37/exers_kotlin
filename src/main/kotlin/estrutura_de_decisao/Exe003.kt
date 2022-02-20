package estrutura_de_decisao

import java.util.Scanner

/*
    Faça um Programa que verifique se uma letra digitada é "F" ou "M".
    Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
 */

fun main() {
    val scanner = Scanner(System.`in`)

    try {
        print("Digite M ou F: ")
        val sexo: String = scanner.next().uppercase()

        println(sexo)

        if(sexo.substring(0,1).equals("M")){
            println("Sexo Masculino")
        }else if(sexo.substring(0,1).equals("F")){
            println("Sexo Feminino")
        }else{
            println("Sexo inválido")
        }

    }catch (e : Exception){
        println("Sexo Inválido")
    }

    scanner.close()
}