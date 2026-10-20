
import java.util.Locale

fun main() {
    val a = readln().toDouble()
    val b = readln().toDouble()
    val c = readln().toDouble()

    val average = (a + b + c) / 3

    println("%.2f".format(Locale.US, average))
}

