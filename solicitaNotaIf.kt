fun main(){
    avaliaNotaIf()
}

fun avaliaNotaIf(){

    println("Escolha uma pontuação de 1 - 5")
    var pontucao: Int = readln().toInt()

    if(pontucao == 1){
        println("Péssimo")
    } else if(pontucao == 2){
        println("Ruim")
    } else if(pontucao == 3){
        println("Satisfatório")
    } else if(pontucao == 4){
        println("Bom")
    } else if(pontucao == 5){
        println("Ótimo")
    } else {
        println("Nota Inválida")
    }
}