fun main() {
    print("Ingrese día:")
    val dia = readLine()!!.toInt()
    print("Ingrese mes:")
    val mes = readLine()!!.toInt()
    if (mes == 12 && dia==24) { print("hoy es navidad"); }
}