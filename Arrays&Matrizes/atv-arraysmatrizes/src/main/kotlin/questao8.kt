fun main() {
    val matriz4x4 = arrayOf(
        intArrayOf(5, 2, 1, 9),
        intArrayOf(3, 8, 4, 2),
        intArrayOf(7, 6, 12, 1),
        intArrayOf(4, 3, 2, 10)
    )

    var somaDiagonalPrincipal = 0

    println("=== Matriz 4x4 ===")
    for (i in matriz4x4.indices) {
        for (j in matriz4x4[i].indices) {
            print("${matriz4x4[i][j]}\t")
            if (i == j) {
                somaDiagonalPrincipal += matriz4x4[i][j]
            }
        }
        println()
    }

    println("\nSoma da Diagonal Principal: $somaDiagonalPrincipal")
}