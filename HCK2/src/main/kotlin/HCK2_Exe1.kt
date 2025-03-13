fun main(){
    // Escreva um programa em que o usuário informe dois números. Então escreva em tela o maior deles.

    print("Insira o valor 1: " )
    var input1 = readLine()?.toDouble()!!

    print("Insira o valor 2 : " )
    var input2 = readLine()?.toDouble()!!

    if(input1 > input2) {
        print("${input1} é o maior valor")
    } else{
        print("${input2} é o maior valor")
    }
}