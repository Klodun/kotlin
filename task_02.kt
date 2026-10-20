
fun main() {
    val population = readln().toInt()
    val area = readln().toDouble()

    val density = population.toDouble() / area

    println("Плотность населения: $density чел./кв. км")
}
