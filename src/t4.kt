fun main() {
    print("Введите выражение в формате: ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ: ")
    val input = readln()

    val parts = input.split(" ")

    if (parts.size != 3) {
        println("Ошибка: Неверный формат ввода.  Должно быть ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ")
        return
    }

    val num1Str = parts[0]
    val num2Str = parts[1]
    val operation = parts[2]

    val num1 = num1Str.toDoubleOrNull()
    val num2 = num2Str.toDoubleOrNull()

    if (num1 == null || num2 == null) {
        println("Ошибка: Некорректный ввод чисел. Введите вещественные числа.")
        return
    }

    val result = when (operation) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> {
            if (num2 == 0.0) {
                println("Ошибка: Деление на ноль!")
                return
            }
            num1 / num2
        }
        else -> {
            println("Ошибка: Недопустимая операция. Используйте +, -, *, /")
            return
        }
    }

    println("Результат: $result")
}
