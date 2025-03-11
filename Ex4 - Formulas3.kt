fun main(){

    println("Informe a diagonal maior do losango: ")
    val losango_maior = readln().toInt()

    println("Informe a diagonal menor do losango: ")
    val losango_menor = readln().toInt()


    val area = losango_maior * losango_menor /2

    println("A area do losango é: $area")

}