fun main(){
    fazerLoop()
}

private fun fazerLoop(){

    println("Escolha um número")
    var numero = readln().toInt()
    var contador: Int = 1
    println(contador)

    if (numero < 0){
        println("O número deve ser positivo")
    }

    while (contador != numero){
        if ((contador + 2) < numero ){
            contador += 2
            println(contador)
        } else {
            contador += 1
            println(contador)
        }
    }

}