fun main(){
    // Faça um programa que leia 6 números que o usuário vai informar. Todos os números lidos com valor inferior a 72 devem ser somados. Escreva o valor final da soma efetuada e também todos valores que o usuário informou.

    val nums = FloatArray(6)
    var soma:Float = 0.0f

    for (i in nums.indices) {
        print("Informe o número ${i + 1}: ")
        nums[i] = readLine()?.toFloat()!!
        if (nums[i] < 72) {
            soma += nums[i]
        }
    }
        println("\nValores informados: ${nums.joinToString(", ")}")
        println("\nSoma dos números com valor inferior a 72: $soma")
}