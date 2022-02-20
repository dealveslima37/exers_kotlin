package estrutura_sequencial

import java.util.*
import kotlin.math.roundToInt

/*
    Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
    Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros,
    que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
 */

fun main() {

    Locale.setDefault(Locale.US)
    val scanner = Scanner(System.`in`)

    try {
        print("Tamanho em metros quadrados: ")
        val metrosQuadrados = scanner.nextDouble()
        val valorLataDeTinta = 80.00
        val metrosQuadradosPorLata = 54
        val latas = Math.ceil(metrosQuadrados / metrosQuadradosPorLata)
        val valorASerPago = valorLataDeTinta * latas

        println("Quantidade de latas $latas")
        println("Preço ${String.format("%.2f", valorASerPago)}")

    }catch (e : Exception){
        println("Refaça a operação digitando números válidos")
    }

    scanner.close()
}