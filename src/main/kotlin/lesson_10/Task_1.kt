package org.example.lesson_10

/*Напиши небольшую игру, в которой пользователь и компьютер по очереди бросают кости.
 Побеждает выбросивший наибольшее число.

- поочередно выводи сообщение о ходе игрока и компьютера (отображать кто бросил, какие значения на кубиках);
- бросок кости вынеси в отдельную функцию, в которой генерируется случайное число от 1 до 6;
- в отдельные переменные сохрани результат работы функции для игрока и компьютера;
- после сравнения результатов, выведи соответствующее сообщение в консоль. Например: "Победило человечество",
"Победила машина" или "Победила дружба".*/

fun main() {
    print("ход игрока: ")
    val stepPlayer = rundomNumber()
    println(stepPlayer)
    print("ход компьютера:  ")
    val stepComputer = rundomNumber()
    println(stepComputer)
    resultComparingNumbers(stepPlayer, stepComputer)
}

fun rundomNumber(): Int? = (0..9).random()

fun resultComparingNumbers(stepPlayer: Int?, stepComputer: Int?) {
    if (stepComputer?: 0 > stepPlayer?: 0) {
        println("Победила машина")
    }else if (stepComputer?: 0 < stepPlayer?: 0) {
        println("Победило человечество")
    } else {
        println("Победила дружба")
    }

}