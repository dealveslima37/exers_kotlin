package estrutura_de_decisao

/*
    Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino
    ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!",
    conforme o caso.
 */

fun main() {

    try {
        print("Em qual turno você estuda [M - Matutino V - Vespertino N - Noturno]: ")
        var turno = readln().uppercase()

        if(turno == "M"){
            println("Bom dia!")
        }else if(turno == "V"){
            println("Boa tarde!")
        }else if(turno == "N"){
            println("Boa noite!")
        }else{
            println("Refaça a operação digitando [M - Matutino V - Vespertino N - Noturno]: ")
        }

    }catch (e : Exception){
        println("Refaça a operação digitando valores válidos")
    }

}