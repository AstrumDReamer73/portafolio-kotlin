fun main(){
    print("Ingrese el primer numero:")
    val num1 = readLine()!!.toInt()
    print("Ingrese el primer numero:")
    val num2 = readLine()!!.toInt()
    print("Ingrese el primer numero:")
    val num3 = readLine()!!.toInt()
    if (num1 == num2 && num2 == num3) { print(num1*num2*num3); }
}