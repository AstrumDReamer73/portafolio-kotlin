fun main(){
    println("ingrese el total de preguntas")
    val total = readLine()!!.toInt()
    println("ingrese el total de preguntas correctas")
    val correctas = readLine()!!.toInt()
    val porcentaje=(correctas/total)*100
    if(porcentaje > 90){ println("nivel maximo") }
    else if(porcentaje in 75..89){ println("nivel medio") }
    else if(porcentaje in 50..74){ println("nivel regular") }
    else if(porcentaje < 50){ println("fuera de nivel") }
}