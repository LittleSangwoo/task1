fun main() {
    print("Введите первую цифру: ")
    val digit1 = readln().toIntOrNull()

    print("Введите вторую цифру: ")
    val digit2 = readln().toIntOrNull()

    if (digit1 == null || digit2 == null) {
        println("Ошибка: Введены некорректные данные. Пожалуйста, введите цифры.")
        return
    }

    if (digit1 !in 0..9 || digit2 !in 0..9) {
        println("Ошибка: Введены не цифры. Пожалуйста, введите цифры от 0 до 9.")
        return
    }

    if (digit1 == digit2) {
        println("Ошибка: Цифры должны быть различными.")
        return
    }

    if (digit1 % 2 != 0) {
        println("Нечетное число: ${digit2}${digit1}")
    } else if (digit2 % 2 != 0) {
        println("Нечетное число: ${digit1}${digit2}")
    } else {
        println("Создать нечетное число невозможно")
    }
}
