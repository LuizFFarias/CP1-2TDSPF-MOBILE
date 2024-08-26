fun main(){
    println(cadastro())
}

fun cadastro(): String{
    println("Nome:")
    var nome = readln()

    println("Idade:")
    var idade: Int = readln().toInt()

    println("Pais de origem")
    var pais = readln()

    return "Nome: $nome, Idade: $idade, Pais: $pais"
}