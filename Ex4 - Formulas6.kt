fun main(){

    println("Informe a base do triangulo: ")
    val base_maior = readln().toInt()

    println("Informe a altura do triangulo: ")
    val altura = readln().toInt()

    val area = base_maior * altura /2

    println("A area do triangulo é: $area")
}