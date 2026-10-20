
fun main() {
    print("Введите возраст: ")
    val age = readln().toIntOrNull()

    if (age == null) {
        println("Ошибка: введите целое число.")
        return
    }

    if (age < 0) {
        println("Ошибка: возраст не может быть отрицательным.")
    } else if (age <= 12) {
        println("ребёнок")
    } else if (age <= 17) {
        println("подросток")
    } else if (age <= 64) {
        println("взрослый")
    } else {
        println("пенсионер")
    }
}
