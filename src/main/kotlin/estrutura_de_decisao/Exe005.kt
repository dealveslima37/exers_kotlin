package estrutura_de_decisao

import java.util.*

/*
    Faça um programa para a leitura de duas notas parciais de um aluno.
    O programa deve calcular a média alcançada por aluno e apresentar:
        - A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
        - A mensagem "Reprovado", se a média for menor do que sete;
        - A mensagem "Aprovado com Distinção", se a média for igual a dez.
 */

fun main() {

    Locale.setDefault(Locale.US)
    val scanner = Scanner(System.`in`)

    try {
        println("Digite as duas notas do aluno")
        val nota1 = scanner.nextDouble()
        val nota2 = scanner.nextDouble()
        val media = (nota1 + nota2) / 2.0
        println("Média = ${String.format("%.2f", media)}")

        when(media){
            10.00 -> println("Aprovado com Distinção")
            in 7.0..9.99 -> println("Aprovado")
            in 0.0..6.99 -> println("Reprovado")
        }

    }catch (e: Exception){
        println("Refaça a operação digitando valores válidos")
    }

    scanner.close()
}