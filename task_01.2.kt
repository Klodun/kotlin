
fun main() {
    print("Введите целое число: ")
    val number = readln().toIntOrNull()

    if (number == null) {
        println("Ошибка: необходимо ввести целое число.")
        return
    }

    if (number > 0) {
        println("Число положительное.")
    } else if (number < 0) {
        println("Число отрицательное.")
    } else {
        println("Число равно нулю.")
    }

    if (number % 2 == 0) {
        println("Число чётное.")
    } else {
        println("Число нечётное.")
    }
}
