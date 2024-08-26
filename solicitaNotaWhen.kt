fun main() {
    avaliaResultadoIf()

}

fun avaliaResultadoIf(){

    println("Escolha uma pontuação de 1 - 5")
    var pontucao: Int = readln().toInt()

    when (pontucao) {
        1 -> println("Péssimo")
        2 -> println("Ruim")
        3 -> println("Satisfatório")
        4 -> println("Bom")
        5 -> println("Ótimo")
        else -> println("Nota Inválida")
    }
}