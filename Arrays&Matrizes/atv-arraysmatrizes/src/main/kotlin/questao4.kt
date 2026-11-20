fun main() {
    val numeros = IntArray(20) { indice -> indice + 1 }
    var somaIndicesPares = 0

    for (i in 0 until numeros.size step 2) {
        val valor = numeros[i]
        somaIndicesPares += valor
        println("Índice par $i -> valor: $valor")
    }

    println("Soma dos valores nos índices pares: $somaIndicesPares")
}