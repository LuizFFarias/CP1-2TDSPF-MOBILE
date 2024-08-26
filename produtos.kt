fun main() {
    fazerLoop()
}

private fun fazerLoop() {
    val produtos = mutableMapOf<String, Double>()
    var escolha: Int

    do {
        println("Escolha uma opção: \n1 - Adicionar novo produto \n2 - Sair")
        escolha = readln().toInt()

        if (escolha == 1) {
            println("Nome do produto:")
            val nomeProduto = readln()

            println("Preço do produto:")
            val precoProduto = readln().toDouble()

            produtos[nomeProduto] = precoProduto

            println("Produto adicionado com sucesso!")
        } else if (escolha == 2) {
            println("Saindo...")
        } else {
            println("Opção inválida, tente novamente.")
        }

    } while (escolha != 2)

    println("\nProdutos adicionados:")
    for ((nome, preco) in produtos) {
        println("Produto: $nome - Preço: R$$preco")
    }

    val valorMedio = produtos.values.average()
    println("\nValor médio dos produtos: R$$valorMedio")

    val produtosOrdenados = produtos.toList().sortedBy { (_, preco) -> preco }

    println("\nProdutos ordenados por preço (crescente):")
    var i = 0
    while (i < produtosOrdenados.size) {
        val (nome, preco) = produtosOrdenados[i]
        println("Produto: $nome - Preço: R$$preco")
        i++
    }
}
