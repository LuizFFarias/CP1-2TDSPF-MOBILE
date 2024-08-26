fun main() {
    val pizza1 = Pizza(
        nome = "Margherita",
        ingredientes = listOf("Mussarela", "Tomate", "Manjericão"),
        preco = 35.00,
        tempoPreparo = 20,
        avaliacao = 4.5
    )

    val pizza2 = Pizza(
        nome = "Pepperoni",
        ingredientes = listOf("Mussarela", "Pepperoni", "Molho de Tomate"),
        preco = 40.00,
        tempoPreparo = 25,
        avaliacao = 4.8
    )

    val pizza3 = Pizza(
        nome = "Quatro Queijos",
        ingredientes = listOf("Mussarela", "Gorgonzola", "Parmesão", "Catupiry"),
        preco = 42.00,
        tempoPreparo = 30,
        avaliacao = 4.7
    )

    pizza1.exibirDetalhes()
    println()
    pizza2.exibirDetalhes()
    println()
    pizza3.exibirDetalhes()
}

class Pizza(
    val nome: String,
    val ingredientes: List<String>,
    val preco: Double,
    val tempoPreparo: Int,
    val avaliacao: Double
) {
    fun exibirDetalhes() {
        println("Nome: $nome")
        println("Ingredientes: ${ingredientes.joinToString(", ")}")
        println("Preço: R$$preco")
        println("Tempo de Preparo: $tempoPreparo minutos")
        println("Avaliação: $avaliacao/5.0")
    }
}
