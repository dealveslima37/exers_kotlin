package estrutura_sequencial

import java.util.*

/*
    Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu
    salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato,
    faça um programa que nos dê:
        a. salário bruto.
        b. quanto pagou ao INSS.
        c. quanto pagou ao sindicato.
        d. o salário líquido.
        e. calcule os descontos e o salário líquido, conforme a tabela abaixo.
 */

fun main() {

    Locale.setDefault(Locale.US)
    val scanner = Scanner(System.`in`)

    try {
        print("Valor da hora R$: ")
        val valorDaHora = scanner.nextDouble();
        print("Horas trabalhadas: ")
        val horasTrabalhadas = scanner.nextDouble();

        val salarioBruto = horasTrabalhadas * valorDaHora
        val inss = salarioBruto * 8 / 100;
        val sindicato = salarioBruto * 5 / 100
        val impostoDeRenda = salarioBruto * 11 / 100
        val salarioLiquido = salarioBruto - (inss + sindicato + impostoDeRenda);

        println("Salário bruto R$ ${String.format("%.2f", salarioBruto)}")
        println("Imposto de renda R$ ${String.format("%.2f", impostoDeRenda)}")
        println("INSS R$ ${String.format("%.2f", inss)}")
        println("Sindicato R$: ${String.format("%.2f", sindicato)}")
        println("Salário liquido ${String.format("%.2f", salarioLiquido)}")

    }catch (e : Exception){
        println("Refaça a operação digitando valores válidos")
    }

    scanner.close()
}