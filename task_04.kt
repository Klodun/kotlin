
fun main() {
    val surname = readln()
    val name = readln()
    val patronymic = readln()
    val year = readln()

    val result = "$surname ${name[0]}.${patronymic[0]}.: $year года рождения"

    println(result)
}
