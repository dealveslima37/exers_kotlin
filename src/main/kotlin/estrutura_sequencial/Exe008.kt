package estrutura_sequencial

import java.util.*

/*
    Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
    Calcule e mostre o total do seu salário no referido mês.
 */

fun main() {

    Locale.setDefault(Locale.US)
    var scanner = Scanner(System.`in`)

    try {
        print("Valor da hora R$: ")
        val valorDaHora = scanner.nextDouble()
        print("Horas trabalhadas: ")
        val horasTrabalhadas = scanner.nextDouble()

        val salario = valorDaHora * horasTrabalhadas;

        println("Salário R$: $salario")
    }catch (e : Exception){
        println("Informe um número válido")
    }

    scanner.close()
}