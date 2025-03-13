fun main(){
    // Faça um programa que receba quatro nums informados pelo usuário, mas informe somente o primeiro, o último e o maior de todos eles (considere que todos os números informados serão diferentes)

        val nums = DoubleArray(4)

        for (i in nums.indices) {
            print("Informe o valor ${i + 1}: ")
            nums[i] = readLine()?.toDouble()!!
        }

        val primeiro = nums.first() //obtém o primeiro valor do array
        val ultimo = nums.last() //obtém o ultimo valor do array
        val maior = nums.maxOrNull() //obtém o maior valor do array

        println("\nPrimeiro valor: $primeiro")
        println("Último valor: $ultimo")
        println("Maior valor: $maior")
}