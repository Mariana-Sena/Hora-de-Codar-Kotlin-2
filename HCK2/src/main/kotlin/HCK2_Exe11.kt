fun main() {
    // Uma micro calculadora: Escreva um programa para ler 2 valores inteiros informados pelo usuário e uma das seguintes operações a serem executadas (codificada da seguinte forma: 1. Adição, 2. Subtração, 3. Divisão, 4. Multiplicação).
    //O programa deve calcular e escrever o resultado dessa operação sobre os dois valores lidos.
    //Observação: Considere que só serão lidos os valores 1, 2, 3 ou 4 para as operações

        print("Digite o primeiro valor: ")
        val num1 = readln().toInt() ?: return println("Entrada inválida")
        //?: = é utilizado para fornecer um valor padrão quando uma expressão é null

        print("Digite o segundo valor:  ")
        val num2 = readln().toInt() ?: return println("Entrada inválida")

        println("Selecione uma operação: 1. Adição, 2. Subtração, 3. Divisão, 4. Multiplicação")
        val operacao = readln().toInt() ?: return println("Operação inválida")

        when (operacao) {
            1 -> println("Resultado: ${num1 + num2}")
            2 -> println("Resultado: ${num1 - num2}")
            3 -> {
                if (num2 != 0) {
                    println("Resultado: ${num1 / num2}")
                } else {
                    println("Divisão por zero não é permitida.")
                }
            }
            4 -> println("Resultado: ${num1 * num2}")
            else -> println("Operação inválida")
        }
}
