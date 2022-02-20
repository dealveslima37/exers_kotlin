package estrutura_sequencial

import java.util.*

/*
    João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu
    trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do
    estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente.
    João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso.
     Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que
     João deverá pagar. Imprima os dados do programa com as mensagens adequadas.
 */

fun main() {

    Locale.setDefault(Locale.US)
    val scanner = Scanner(System.`in`)

    try {
        print("Kilos de peixe: ")
        val kgPeixes = scanner.nextDouble()
        val pesoExtra = kgPeixes - 50;
        val multa = pesoExtra * 4;

        println("Peixe Kg: $kgPeixes")
        println("Peso Extra: $pesoExtra")
        println("Multa R$: ${String.format("%.2f", multa)}")

    }catch (e : Exception){
        println("Refaça a operação digitando valores válidos")
    }

    scanner.close()
}