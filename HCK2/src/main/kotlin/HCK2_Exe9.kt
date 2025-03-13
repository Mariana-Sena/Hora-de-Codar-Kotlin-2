fun main() {
    // Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que ela nasceu).

    val anoNascimento:Int
    val idade: Int
    val anoAtual = 2025

    print("Digite seu ano de nascimento: ")
    anoNascimento = readln().toInt()

    idade = anoAtual - anoNascimento

    if (idade >= 16){
        println("Você pode votar!")
    }else{
        println("Você ainda não pode votar.")
    }
}