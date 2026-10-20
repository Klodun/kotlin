

fun main() {
    print("Введите номер или название месяца: ")
    val input = readln().trim().lowercase()

    val month = input.toIntOrNull()

    val season = if (month != null) {
        when (month) {
            12, 1, 2 -> "зима"
            3, 4, 5 -> "весна"
            6, 7, 8 -> "лето"
            9, 10, 11 -> "осень"
            else -> null
        }
    } else {
        when (input) {
            "декабрь", "январь", "февраль" -> "зима"
            "март", "апрель", "май" -> "весна"
            "июнь", "июль", "август" -> "лето"
            "сентябрь", "октябрь", "ноябрь" -> "осень"
            else -> null
        }
    }

    if (season == null) {
        println("Ошибка: введите месяц от 1 до 12 или его название.")
    } else {
        println(season)
    }
}
