fun main(){
    println("ingrese el numero de personas")
    var personas= readLine()!!.toInt()
    var i:Int=0; var total:Double=0.0
    while(i <= personas){
        print("ingrese la altura de la persona $i: ")
        var altura= readLine()!!.toDouble()
        var total=+altura
    }
    var promedio=total/personas
}