fun main(){
    print("ingrese el numero de empleados = ")
    var empleados= readLine()!!.toInt()
    var i:Int=1;
    var total:Double=0.0; var sueldo1=0; var sueldo2=0;
    while(i<empleados){
        print("ingrese el sueldo del empleado $i = ")
        var sueldo= readLine()!!.toDouble()
        if (sueldo in 100.0..300.0) {
            sueldo1++
            total += sueldo
        } else if (sueldo in 301.0..500.0) {
            sueldo2++
            total += sueldo
        } else { println("Sueldo fuera del rango permitido (100-500). No se registra.") }
        i++
    }
    println("********")
    println("total de nominas = $total")
    println("personas con sueldo menor de 300 = $sueldo1")
    println("personas con sueldo mayor de 300 = $sueldo2")
}