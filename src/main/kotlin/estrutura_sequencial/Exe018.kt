package estrutura_sequencial

import java.util.*

/*
    Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps),
    calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).
 */

fun main() {
    Locale.setDefault(Locale.US)
    val scanner = Scanner(System.`in`)

    try {
        println("Tamanho do arquivo(MB): ")
        val tamanhoDoArquivo = scanner.nextDouble()
        println("Velocidade do link(Mbps): ")
        val velocidade = scanner.nextDouble()

        val valodicadeDeDownloads  = velocidade / tamanhoDoArquivo

        println("Tempo aproximado de download ${String.format("%.2f", valodicadeDeDownloads)}")

    }catch (e : Exception){
        println("Refaça a operação digitando valores válidos")
    }

    scanner.close()
}