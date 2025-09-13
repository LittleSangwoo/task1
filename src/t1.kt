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

    for (i in 1 until str.length) {
        if (str[i] == str[i - 1]) {
            count++
        } else {
            print(str[i - 1])
            if (count > 1) {
                print(count)
            }
            count = 1
        }
    }
    print(str.last())
    if (count > 1) {
        print(count)
    }
}
