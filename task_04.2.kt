
fun main() {
    print("Введите номер дня недели (1-7): ")
    val day = readln().toIntOrNull()

    if (day == null) {
        println("Ошибка: введите целое число.")
        return
    }

    val name = when (day) {
        1 -> "Понедельник"
        2 -> "Вторник"
        3 -> "Среда"
        4 -> "Четверг"
        5 -> "Пятница"
        6 -> "Суббота"
        7 -> "Воскресенье"
        else -> {
            println("Ошибка: номер должен быть от 1 до 7.")
            return
        }
    }

    println(name)
}
