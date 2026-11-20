fun main() {
    val matriz = arrayOf(
        intArrayOf(15, 0, 25),
        intArrayOf(0, 40, 0),
        intArrayOf(10, 5, 0)
    )

    var somaMaioresQueZero = 0

    for (i in matriz.indices) {
        for (j in matriz[i].indices) {
            val valor = matriz[i][j]
            if (valor == 0) {
                continue
            }
            somaMaioresQueZero += valor
        }
    }

    println("Soma dos valores maiores que zero: $somaMaioresQueZero")
}