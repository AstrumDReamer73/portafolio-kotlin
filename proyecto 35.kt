fun main(){
    var x:Int=0
    var aprobado=0
    var reprobados=0
    while(x<=10){
        print("ingrese la nota del alumno $x:")
        var nota= readLine()!!.toDouble()
        if(nota>=70){ aprobado++ }
        else{ reprobados++ }
        x++
    }
    println("********")
    println("hay $aprobado alumnos aprobados y $reprobados alumnos reprobados")
}