fun main() {
    val original = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6)
    )

    val linhasOriginais = original.size
    val colunasOriginais = original[0].size

    val transposta = Array(colunasOriginais) { IntArray(linhasOriginais) }

    for (i in 0 until linhasOriginais) {
        for (j in 0 until colunasOriginais) {
            transposta[j][i] = original[i][j]
        }
    }

    println("=== Matriz Original (2x3) ===")
    for (linha in original) {
        println(linha.contentToString())
    }

    println("\n=== Matriz Transposta (3x2) ===")
    for (linha in transposta) {
        println(linha.contentToString())
    }
}