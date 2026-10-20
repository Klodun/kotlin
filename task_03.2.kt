
import kotlin.math.sqrt

fun main() {
    print("Введите коэффициент a: ")
    val a = readln().toDoubleOrNull()
    if (a == null) {
        println("Ошибка: неверное значение a.")
        return
    }

    print("Введите коэффициент b: ")
    val b = readln().toDoubleOrNull()
    if (b == null) {
        println("Ошибка: неверное значение b.")
        return
    }

    print("Введите коэффициент c: ")
    val c = readln().toDoubleOrNull()
    if (c == null) {
        println("Ошибка: неверное значение c.")
        return
    }

    if (a == 0.0) {
        if (b == 0.0) {
            if (c == 0.0) {
                println("Бесконечно много решений.")
            } else {
                println("Корней нет.")
            }
        } else {
            println("Линейное уравнение: x = ${-c / b}")
        }
        return
    }

    val d = b * b - 4 * a * c

    if (d > 0) {
        val x1 = (-b + sqrt(d)) / (2 * a)
        val x2 = (-b - sqrt(d)) / (2 * a)
        println("x1 = $x1")
        println("x2 = $x2")
    } else if (d == 0.0) {
        val x = -b / (2 * a)
        println("Один корень: x = $x")
    } else {
        println("Действительных корней нет.")
    }
}
