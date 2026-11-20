fun main() {
    val numeros = intArrayOf(10, 20, 30, 40, 50, 60)

    var esquerda = 0
    var direita = numeros.size - 1

    while (esquerda < direita) {
        val temp = numeros[esquerda]
        numeros[esquerda] = numeros[direita]
        numeros[direita] = temp

        esquerda++
        direita--
    }

    println("Vetor invertido: ${numeros.contentToString()}")
}