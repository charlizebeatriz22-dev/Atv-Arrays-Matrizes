fun main() {
    val notasAlunos = Array(3) { DoubleArray(2) }

    notasAlunos[0][0] = 8.0
    notasAlunos[0][1] = 7.5

    notasAlunos[1][0] = 5.0
    notasAlunos[1][1] = 6.0

    notasAlunos[2][0] = 9.0
    notasAlunos[2][1] = 8.0 

    var somaMediasIndividuais = 0.0

    for (i in notasAlunos.indices) {
        val n1 = notasAlunos[i][0]
        val n2 = notasAlunos[i][1]
        val mediaAluno = (n1 + n2) / notasAlunos[i].size
        somaMediasIndividuais += mediaAluno

        val situacao = if (mediaAluno >= 7.0) "Aprovado" else "Reprovado"
        println("Aluno ${i + 1} | Notas: $n1, $n2 | Média: ${"%.2f".format(mediaAluno)} | Situação: $situacao")
    }

    val mediaGeralTurma = somaMediasIndividuais / notasAlunos.size
    println("\nMédia geral da turma: ${"%.2f".format(mediaGeralTurma)}")
}