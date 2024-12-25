fun main() {
    println("Введите два числа и символ операции в формате: ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ")
    val input = readLine()

    if (input.isNullOrEmpty()) {
        println("Некорректный ввод. Попробуйте снова.")
        return
    }

    val parts = input.split(" ")
    if (parts.size != 3) {
        println("Ошибка: введите данные в формате ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ")
        return
    }

    val num1 = parts[0].toDoubleOrNull()
    val num2 = parts[1].toDoubleOrNull()
    val operation = parts[2]

    if (num1 == null || num2 == null) {
        println("Ошибка: введены некорректные числа.")
        return
    }

    val result = when (operation) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 != 0.0) num1 / num2 else {
            println("Ошибка: деление на ноль.")
            return
        }
        else -> {
            println("Ошибка: неизвестная операция '$operation'. Используйте +, -, *, /.")
            return
        }
    }

    println("Результат: $result")
}
