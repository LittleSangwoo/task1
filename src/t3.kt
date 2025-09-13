fun main() {
    print("Введите число: ")
    var str: Int = readln().toInt()
    var res = " "
    while(str > 0) {
        res += str % 2
        str /= 2
    }
    print(res.reversed())
}