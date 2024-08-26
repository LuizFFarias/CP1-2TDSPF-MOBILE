fun main() {
    //desconto();
    //loop();
}



fun desconto(): Float {
    println("Escolha um valor")
    var valor = readln().toFloat();

    println("Escolha um desconto")
    var desconto = readln().toFloat();

    var valorFinal = valor - (valor * (desconto/100));

    println("O valor final: $valorFinal")

    return valorFinal;
}


fun loop(){
    var numero: Int = 1;
    while (numero != 0){
        println("Digite um numero")
        numero = readln().toInt();
        if (numero == 0){
            println("Encerrando loop")
        }
    }
}

