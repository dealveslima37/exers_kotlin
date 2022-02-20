package estrutura_de_decisao

import java.util.*

/*
    Faça um Programa que leia três números e mostre o maior e o menor deles.
 */

fun main() {

    Locale.setDefault(Locale.US)
    val scanner = Scanner(System.`in`)

    try {
        println("Digite 3 valores inteiros")
        val valor1 = scanner.nextInt()
        val valor2 = scanner.nextInt()
        val valor3 = scanner.nextInt()

        if(valor1 == valor2 && valor1 == valor3){
            println("Valores digitados são iguais")
        }
        else if(valor1 >= valor2 && valor1 >= valor3){
            println("Maior valor é $valor1")
        }else if(valor2 >= valor1 && valor2 >= valor3){
            println("Maior valor é $valor2")
        }else if(valor3 >= valor1 && valor3 >= valor2){
            println("Maior valor é $valor3")
        }

        if(valor1 <= valor2 && valor1 <= valor3){
            println("Menor valor é $valor1")
        }else if(valor2 <= valor1 && valor2 <= valor3){
            println("Menor valor é $valor2")
        }else if(valor3 <= valor1 && valor3 <= valor2){
            println("Menor valor é $valor3")
        }

    }catch (e: Exception){
        println("Refaça a operação digitando valores válidos")
    }

    scanner.close()
}