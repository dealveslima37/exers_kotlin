package estrutura_sequencial

import java.util.*

/*
    Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
        a. o produto do dobro do primeiro com metade do segundo.
        b. a soma do triplo do primeiro com o terceiro.
        c. o terceiro elevado ao cubo.
 */

fun main() {
    Locale.setDefault(Locale.US)
    val scanner = Scanner(System.`in`)

    try {
        println("Digite dois números inteiros e um real")
        val numero1 = scanner.nextInt()
        val numero2 = scanner.nextInt()
        val numero3 = scanner.nextDouble()
        val a = (numero1 * 2) * (numero2 / 2)
        val b = (numero1 * 3) + numero3
        val c = Math.pow(numero3, 3.0)

        println("O produto do dobro do primeiro com metade do segundo $a")
        println("A soma do triplo do primeiro com o terceiro $b")
        println("O terceiro elevado ao cubo $c")

    }catch (e : Exception){
        print("Refaça a operação digitando um número válido!")
    }

}