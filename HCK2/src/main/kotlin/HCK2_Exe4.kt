fun main(){
    // Faça um programa que leia 3 valores informados pelo usuário (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.

        print("Informe o primeiro valor: ")
        val valor1 = readLine()!!.toInt()

        print("Informe o segundo valor: ")
        val valor2 = readLine()!!.toInt()

        print("Informe o terceiro valor: ")
        val valor3 = readLine()!!.toInt()

        val somaMaiores = if (valor1 >= valor2 && valor1 >= valor3) {
            valor1 + maxOf(valor2, valor3)
        } else if (valor2 >= valor1 && valor2 >= valor3) {
            valor2 + maxOf(valor1, valor3)
        } else {
            valor3 + maxOf(valor1, valor2)
        }
        // maxOf(): Returns the maximum value from a list of expressions

        println("\nA soma dos dois maiores valores é: $somaMaiores")
}