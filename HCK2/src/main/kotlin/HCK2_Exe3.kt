fun main(){
    // Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.

    var num1: Int
    var num2: Int
    var num3: Int

    print("Insira o valor 1: ")
    num1 = readLine()?.toInt()!!

    print("Insira o valor 2: ")
    num2 = readLine()?.toInt()!!

    print("Insira o valor 3: ")
    num3 = readLine()?.toInt()!!


    if (num1 > num2 && num1 > num3){
        print("O maior número é $num1")
    } else if(num2 > num1 && num2 > num3){
        print("O maior número é $num2")
    }else{
        print("O maior número é $num3")
    }
}