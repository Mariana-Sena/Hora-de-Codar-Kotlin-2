fun main(){
    // Escreva um programa que calcule a média de quatro números informados pelo usuário, mas somente se esses números forem maiores que 0 e menores que 10. No final, se a média for maior que cinco o usuário receberá uma mensagem "Você passou no teste". Em qualquer outra situação, ele receberá uma mensagem de "tente novamente"

    var soma = 0.0
    var j = 0

    while (j < 4) {
        print("Informe o valor ${j + 1} (entre 1 e 9): ")
        val valor = readln().toDouble()
        if (valor > 0 && valor < 10) {
            soma += valor
            j++
        } else {
            println("\nValor inválido. Deve estar entre 1 e 9.\n")
        }
    }

    val media = soma / 4

    if (media > 5) {
        println("Você passou no teste! \nMédia: $media")
    } else {
        println("Tente novamente. \nMédia: $media")
    }
}