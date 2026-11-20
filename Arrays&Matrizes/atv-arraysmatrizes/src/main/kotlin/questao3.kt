fun main() {
    val temperaturas = doubleArrayOf(28.5, 31.0, 29.5, 33.2, 27.8, 30.4, 32.0)
    var soma = 0.0

    for (temp in temperaturas) {
        soma += temp
    }

    val media = soma / temperaturas.size
    println("Média de temperaturas da semana: ${"%.2f".format(media)}°C")
    println("Dias (índices) com temperatura acima da média:")

    for (i in temperaturas.indices) {
        if (temperaturas[i] > media) {
            println("- Índice $i: ${temperaturas[i]}°C")
        }
    }
}