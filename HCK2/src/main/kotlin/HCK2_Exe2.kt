fun main(){
    // Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou zero.

    print("Insira um valor : " )
    var input = readLine()?.toDouble()!!

    if(input > 0) {
        print("O valor informado é positivo.")
   }else if (input < 0){
        print("O valor informado é negativo.")
   } else{
       println("O valor informado é zero.")
    }
}

//else if: multiple conditions
