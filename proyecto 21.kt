fun main(){
    println("ingrese un numero")
    val num1= readLine()!!.toInt()
    if(num1>1){ println("el numero tiene un digito") }
    else if(num1>10){ println("el numero tiene dos digitos") }
    else if(num1>100){ println("el numero tiene tres digitos") }
    else if(num1>1000){ println("el numero tiene mas de cuatro digitos") }
}