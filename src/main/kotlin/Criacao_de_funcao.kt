fun main(){
    helloWorld()
    println("A soma de 10 e 5 é ${sum(10,5)}")
    //sum(10, 5)
}
fun sum(a:Int, b:Int):Int{
    val c = a + b
    return c
    //return (a + b)
}
fun helloWorld():Unit{
    println("Hello, World")
}