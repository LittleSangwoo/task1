fun main() {
    print("Введите строку: ")
    val str = readln()

    // Проверка на пустую строку и на наличие только букв.
    if (str.isEmpty()) {
        println("Строка пустая.  Введите строку с символами.")
        return
    }

    if (!str.all { it.isLetter() }) {
        println("Ошибка: Строка должна содержать только буквы.")
        return
    }

    var count = 1
    val str2 = str.toList().sorted()
    for (i in 1 until str2.count()) {
        if (str2[i] == str2[i - 1]) {
            count++
        } else {
            print(str2[i - 1])
            if (count > 1) {
                println(" - $count ")
            }
            count = 1
        }
    }
    print(str2.last())
    if (count > 1) {
        println(" - $count")
    }
}
