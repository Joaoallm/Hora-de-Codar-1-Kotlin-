fun main(){

    println("Informe a base maior do trapézio: ")
    val base_maior = readln().toInt()

    println("Informe a base menor do trapézio: ")
    val base_menor = readln().toInt()

    print("Informe a altura do trapézio: ")
    val altura = readln().toInt()

    val area = (base_maior + base_menor) * altura /2

    println("A area do trapézio é: $area")
}