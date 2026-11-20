fun main() {
    val codigosTransacao = arrayOf("TXN-101", "TXN-205", "TXN-309", "TXN-412", "TXN-550")
    val codigoAlvo = "TXN-309"
    var encontrado = false

    for (i in codigosTransacao.indices) {
        if (codigosTransacao[i] == codigoAlvo) {
            println("Código '$codigoAlvo' encontrado na posição (índice): $i")
            encontrado = true
            break // Interrompe o laço imediatamente após encontrar
        }
    }

    if (!encontrado) {
        println("Código '$codigoAlvo' não encontrado.")
    }
}