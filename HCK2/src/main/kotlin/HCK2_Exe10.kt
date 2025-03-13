fun main(){
    // Tendo como entrada a altura e o gênero designado ao nascer (codificado da seguinte forma: 1: feminino - 2: masculino - ) de uma pessoa, construa um programa que calcule e imprima seu peso ideal, utilizando as seguintes fórmulas.

    var altura:Double
    var pesoIdeal:Double
    var genero:Int

    print("digite sua altura (m): ")
    altura = readln().toDouble()

    print("Indique seu gênero, digitando 1 para feminino ou 2 para masculino: ")
    genero = readln().toInt()
    
    if(genero == 1){
        pesoIdeal = (62.1 * altura) - 44.7
    } else if (genero == 2){
        pesoIdeal = (72.7 * altura) - 58
    } else {
        print("Opção inválida.)")
        return
    }

    println("\nSeu peso ideal é: $pesoIdeal")
}