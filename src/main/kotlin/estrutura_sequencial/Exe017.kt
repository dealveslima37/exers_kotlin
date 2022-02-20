package estrutura_sequencial

import java.util.*
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Local

/*
    Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
    Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros,
    que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
        - Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
        - comprar apenas latas de 18 litros;
        - comprar apenas galões de 3,6 litros;
        - misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre arredonde os valores para cima,
        isto é, considere latas cheias.
 */

fun main() {
    Locale.setDefault(Locale.US)
    val scanner = Scanner(System.`in`)

    try {
        print("Metros quadrados: ")
        val metrosQuadrados = scanner.nextDouble()
        val coberturaDaLata = 108
        val coberturaGalao = 21
        val tintaNecessaria = metrosQuadrados / 6
        val latas = Math.ceil(metrosQuadrados / coberturaDaLata)
        val galoes = Math.ceil(metrosQuadrados / coberturaGalao)

        val precoLatas = latas * 80.00
        val precoGaloes = galoes * 25

        println("Quantidade de litros de tintas: ${String.format("%.3f", tintaNecessaria)}")
        println("São necessários $latas ou $galoes galões de tintas")
        println("Preço latas R$ ${String.format("%.2f", precoLatas)}")
        println("Preço galões R$ ${String.format("%.2f", precoGaloes)}")

    }catch (e : Exception){
        println("Refaça a operação digitando valores válidos")
    }

    scanner.close()
}