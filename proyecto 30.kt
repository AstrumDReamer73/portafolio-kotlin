fun main() {
    // Pedir al usuario que ingrese tres valores enteros
    print("Ingrese el primer número: ")
    val num1 = readLine()!!.toInt()
    print("Ingrese el segundo número: ")
    val num2 = readLine()!!.toInt()
    print("Ingrese el tercer número: ")
    val num3 = readLine()!!.toInt()

    // Determinar el menor usando if como expresión
    val menor = if (num1 < num2 && num1 < num3) num1 else if (num2 < num3) num2 else num3

    // Determinar el mayor usando if como expresión
    val mayor = if (num1 > num2 && num1 > num3) num1 else if (num2 > num3) num2 else num3

    // Imprimir los valores obtenidos
    println("El menor número es: $menor")
    println("El mayor número es: $mayor")
}
