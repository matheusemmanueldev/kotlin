fun main(){
  converterAnos(2)
    println(caracters("sdnfjbndsjfb jdsnfuj"))
    println(cubo(3))
    println(milhas(2f))
    ex5("aaaaaAAAAAA sdhngjusdgfjbsdSGHNSHDGJHFD XXXXXxxxxxxx xxxxSXXXxxx")
}
val anos = 2


fun converterAnos(anos:Int){
    println("$anos anos equivalem a:")
    println("${anos * 12} meses")
    println("${anos * 365} dias")
    println("${anos * 365 * 24} horas")
    println("${anos * 365 * 24 * 60} minutos")
    println("${anos * 365 * 24 * 60 * 60} segundos")
}
fun caracters(str:String):Int = str.length

fun cubo(n:Int):Int = n* n * n

fun milhas(milhas:Float):Float = milhas * 1.6f

fun ex5(str:String){
   //   println(str.replace("A","x").replace("a","x").lowercase())
   // println(str.lowercase().replace("a","x"))
    println(str.replace("a","x",true).lowercase())
}

