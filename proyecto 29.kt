fun main(){
    println("ingrese la coordenada x")
    val x = readLine()!!.toDouble()
    println("ingrese la coordenada y")
    val y = readLine()!!.toDouble()
    if(x > 0 && y > 0){ println("esta en el primer cuadrante") }
    else if(x > 0 && y < 0){ println("esta en el segundo cuadrante") }
    else if(x < 0 && y < 0){ println("esta en el tercer cuadrante") }
    else if(x < 0 && y > 0){ println("esta en el cuarto cuadrante") }
}