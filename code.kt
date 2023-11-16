fun main() {
    var balance = 0

    while (true) {
        println("Введите сколько у вас есть денежных средств:")
        val initialBalance = readLine()?.toIntOrNull()

        if (initialBalance != null) {
            balance += initialBalance
            break
        } else {
            println("Некорректный ввод. Пожалуйста, введите сумму в числовом формате.")
        }
    }

    while (true) {
        println("\nУ вас $balance тенге!")
        println("\nЧто вы хотите купить?\n" +
                "1. Cola\n" +
                "2. Pepsi\n" +
                "3. Asu\n" +
                "4. Albeni\n" +
                "5. KitKat")

        val choice = readLine()?.toIntOrNull()

        if (choice in 1..5) {
            val productPrice = when (choice) {
                1 -> 250
                2 -> 300
                3 -> 200
                4 -> 150
                5 -> 400
                else -> 0
            }

            if (balance >= productPrice) {
                balance -= productPrice
                println("\nВы покупаете продукт! ${balance} тенге сдача.")
            } else {
                println("\nУ вас не достаточно средств для покупки.")
                break
            }

            println("\nХотите ли вы приобрести еще один продукт? 1. Yes / Введите любой символ для того чтобы выйти")
            val continueChoice = readLine()

            if (continueChoice != "1") {
                break
            }
        } else {
            println("Некорректный выбор. Пожалуйста, выберите число от 1 до 5.")
        }
    }

    println("\nУ вас $balance тенге!")
}
