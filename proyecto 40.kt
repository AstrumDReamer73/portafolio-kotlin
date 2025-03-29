fun main(){
    val lista1 = mutableListOf<Int>()
    val lista2 = mutableListOf<Int>()

    println("Ingrese 5 valores para la Lista 1:")
    for (i in 1..5) {
        print("Valor $i: ")
        lista1.add(readLine()?.toIntOrNull() ?: 0)
    }

    println("Ingrese 5 valores para la Lista 2:")
    for (i in 1..5) {
        print("Valor $i: ")
        lista2.add(readLine()?.toIntOrNull() ?: 0)
    }

    val sumaLista1 = lista1.sum()
    val sumaLista2 = lista2.sum()

    when {
        sumaLista1 > sumaLista2 -> println("Lista 1 mayor")
        sumaLista1 < sumaLista2 -> println("Lista 2 mayor")
        else -> println("Listas iguales")
    }
}