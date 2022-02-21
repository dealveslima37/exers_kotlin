package estrutura_de_decisao

import java.util.*

/*
    As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa
    que calculará os reajustes.
        - Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
        - salários até R$ 280,00 (incluindo) : aumento de 20%
        - salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
        - salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
        - salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
        - o salário antes do reajuste;
        - o percentual de aumento aplicado;
        - o valor do aumento;
        - o novo salário, após o aumento.
 */

fun main() {

    Locale.setDefault(Locale.US)
    val scanner = Scanner(System.`in`)

    try {
        print("Entre com o Salário R$: ")
        var salario = scanner.nextDouble()
        var aumento : Double = 0.0
        var porcentagem : String = ""
        var novoSalario : Double = 0.0
        if(salario <= 280.00){
            aumento = (salario * 20) / 100
            novoSalario = salario + aumento
            porcentagem = "20%"
        }else if(salario <= 700){
            aumento = (salario * 15) / 100
            novoSalario = salario + aumento
            porcentagem = "15%"
        }else if(salario <= 1500){
            aumento = (salario * 10) / 100
            novoSalario = salario + aumento
            porcentagem = "10%"
        }else if(salario > 1500){
            aumento = (salario * 5) / 100
            novoSalario = salario + aumento
            porcentagem = "5%"
        }

        println("Salário R$: ${String.format("%.2f", salario)}")
        println("Salário com reajuste R$: ${String.format("%.2f", novoSalario)}")
        println("Aumento de R$: ${String.format("%.2f", aumento)}")
        println("Porcentagem de aumento $porcentagem")
    }catch (e : Exception){
        println("Refaça o operação digitando valores válidos")
    }

    scanner.close()
}