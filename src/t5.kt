import kotlin.math.*

fun main() {
    print("Введите целое число n: ")
    val n = readln().toIntOrNull()
    if (n == null) {
        println("Ошибка: Введено некорректное число n.")
        return
    }

    print("Введите основание степени x: ")
    val x = readln().toIntOrNull()
    if (x == null) {
        println("Ошибка: Введено некорректное число x.")
        return
    }

    if (x == 0) {
        if (n == 1) {
            println("Целочисленный показатель не существует.") // Любое число в степени 0 = 1
        } else if (n == 0) {
            println("Целочисленный показатель не существует.")
        }
        else
            println("Целочисленный показатель не существует.") // Если x == 0 и n != 1, то нет решения.
        return
    }

    if (x == 1){
        if(n == 1) {
            println("Целочисленный показатель: любое число") // 1 в любой степени 1
        } else {
            println("Целочисленный показатель не существует") // 1 в любой степени не даст другое число
        }
        return
    }

    if (x == -1){
        if (n == 1) {
            println("Целочисленный показатель: четное число")
        } else if (n == -1){
            println("Целочисленный показатель: нечетное число")
        } else {
            println("Целочисленный показатель не существует")
        }
        return
    }


    val yDouble = log(abs(n.toDouble()), abs(x.toDouble()))

    if (yDouble == floor(yDouble)) {
        val y = yDouble.toInt()

        if (x < 0 && n < 0) {
            if (y % 2 == 1) {
                println("Целочисленный показатель: $y")
            } else {
                println("Целочисленный показатель не существует")
            }
        } else if(x < 0 && n > 0) {
            if(y % 2 == 0) {
                println("Целочисленный показатель: $y")
            } else {
                println("Целочисленный показатель не существует")
            }
        } else {
            println("Целочисленный показатель: $y")
        }

    } else {
        println("Целочисленный показатель не существует")
    }
}
