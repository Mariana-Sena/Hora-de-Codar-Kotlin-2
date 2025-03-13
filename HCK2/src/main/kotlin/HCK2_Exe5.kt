fun main(){
    // Faça um programa que leia 6 valores informados pelo usuário, calcule, exiba os números informados e escreva a média aritmética desses valores lidos.

    val values = FloatArray(6) // criando um array do tipo Float

        for (i in values.indices) {
            //indices = retorna um intervalo de índices válidos para um array. Neste caso, o array values
            print("Informe o valor ${i + 1}: ") //interpolação de string (para exibir 1, 2, .. , 6)
            values[i] = readLine()?.toFloat()!! //lê a entrada do user armazenando no array values na posição correspondete ao indice i
        }

        println("\nValores informados: ${values.joinToString(", ")}")
        // joinToString() function is used to convert an array or a list to a string which is separated with the mentioned separator (in this case, a comma)

        val media = values.average() //traz a média dos valores armazenados no array values
        println("\nA média aritmética dos valores é: $media")
}