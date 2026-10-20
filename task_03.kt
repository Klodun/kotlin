
import kotlin.math.sqrt
import java.util.Locale

fun main() {
    val x1 = readln().toDouble()
    val y1 = readln().toDouble()
    val x2 = readln().toDouble()
    val y2 = readln().toDouble()

    val distance = sqrt(
        (x2 - x1) * (x2 - x1) +
                (y2 - y1) * (y2 - y1)
    )

    println("%.3f".format(Locale.US, distance))
}

