fun maiorDeIdade(idade:Int){
    if (idade > 18){
        println("Maior de idade")

        if(idade > 60){
            println("Terceira idade")
        }
    } else if (idade < 10){
        println("Criança")
    } else {
        println("Menor de idade")
    }
}

fun sauadcao(dia: Boolean) = if (dia){
    println("Bom dia")
    } else {
    println("Boa noite")
    }


fun main(){
    maiorDeIdade(19)
    maiorDeIdade(15)
    sauadcao(dia = false)
}