fun main(){
    calcularMediaWhile()
}

fun calcularMediaWhile(){
    var numero: Float = 0.0F
    var media: Float = 0.0F
    var numeroTotal: Float = 0.0F
    var contador: Int = 0


    while (numero >= 0){

            println("Digite um numero maior que 0")
            numero = readln().toFloat()

        if (numero >= 0){
            numeroTotal += numero;

            contador += 1
        } else {
            println("Finalizando...")
        }

    }
    media = (numeroTotal/contador).toFloat()

    println("Média dos números: ${media}, Números Selecionados: ${contador}, Total: ${numeroTotal}.")
}