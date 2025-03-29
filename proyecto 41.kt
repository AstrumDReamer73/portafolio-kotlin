fun main(){
    print("ingrese el numero de numeros = ")
    var numeros = readLine()!!.toInt()
    var i=1;var pares=0;var impares=0
    while(i<=numeros){
        print("ingrese el numero $i = ")
        var numero = readLine()!!.toInt()
        if(numero % 2 == 0){ pares++ }
        else{ impares++ }
    }
    println("*********")
    println("hay $pares numeros pares y $impares numeros impares")
}