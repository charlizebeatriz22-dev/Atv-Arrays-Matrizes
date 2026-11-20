fun main() {
    val tarefas = arrayOf(
        "Revisar requisitos do sistema",
        "Criar diagrama de classes UML",
        "Testar endpoints da API",
        "Subir código no GitHub"
    )

    for ((indice, tarefa) in tarefas.withIndex()) {
        println("${indice + 1}. $tarefa")
    }
}