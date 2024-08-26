fun main() {
    val estudante1 = Estudante("Ana", 20, "Matemática")
    val estudante2 = Estudante("Carlos", 22, "Física")
    val estudante3 = Estudante("Maria", 19, "Química")

    val professor1 = Professor("João", 45, "História")
    val professor2 = Professor("Pedro", 50, "Geografia")
    val professor3 = Professor("Lucia", 40, "Literatura")

    println("Informações dos Estudantes:")
    estudante1.exibirNome()
    estudante1.exibirIdade()
    estudante1.exibirCurso()

    estudante2.exibirNome()
    estudante2.exibirIdade()
    estudante2.exibirCurso()

    estudante3.exibirNome()
    estudante3.exibirIdade()
    estudante3.exibirCurso()

    println("\nInformações dos Professores:")
    professor1.exibirNome()
    professor1.exibirIdade()
    professor1.exibirDisciplina()

    professor2.exibirNome()
    professor2.exibirIdade()
    professor2.exibirDisciplina()

    professor3.exibirNome()
    professor3.exibirIdade()
    professor3.exibirDisciplina()
}

open class Pessoa(val nome: String, val idade: Int) {
    fun exibirNome() {
        println("Nome: $nome")
    }

    fun exibirIdade() {
        println("Idade: $idade")
    }
}
class Estudante(nome: String, idade: Int, val curso: String) : Pessoa(nome, idade) {
    fun exibirCurso() {
        println("Curso: $curso")
    }
}
class Professor(nome: String, idade: Int, val disciplina: String) : Pessoa(nome, idade) {
    fun exibirDisciplina() {
        println("Disciplina: $disciplina")
    }
}