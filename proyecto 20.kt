fun main() {
    print("Ingrese primer valor:")
    val num1 = readLine()!!.toInt()
    if(num1 > 0){ println("positivo") }
    else if(num1==0){ println("es 0") }
    else{ println("negativo") }
}