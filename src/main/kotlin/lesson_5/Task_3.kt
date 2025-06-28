package org.example.lesson_5

import kotlin.random.Random

/*Для алгоритма простого приложения-лотереи, нужно угадать два числа от 0 до 42.
 Если угадать только одно – игрок получает утешительный приз. Напиши программу,
  проверяющую выигрыш. Пользователь должен вводить числа в консоль.
  Правильные числа заранее известны и хранятся в переменных.
  Оформить ввод текстовыми подсказками о том, что нужно вводить.
   Вывести отдельным сообщением, какие числа были нужны для победы.

- если оба числа угаданы вывести “Поздравляем! Вы выиграли главный приз!”;
- если угадано только одно число, вывести “Вы выиграли утешительный приз!”;
- если не угадано ничего, вывести “Неудача!”;
- программа должна учитывать ввод чисел в обратном порядке.*/

fun main() {
    val lotteryNumberFirst = Random.nextInt(0, 42)
    println("Далее показано рандомное число, что бы можно было проверить работоспособность $lotteryNumberFirst")

    val lotteryNumberSecond = Random.nextInt(0, 42)
    println("Далее показано рандомное число, что бы можно было проверить работоспособность $lotteryNumberSecond")

    println("Введите число от 0 до 42")
    val firstEntredNumber = readln().toInt()

    println("Введите число от 0 до 42")
    val secondEntredNumber = readln().toInt()

    if ((firstEntredNumber == lotteryNumberFirst && secondEntredNumber == lotteryNumberSecond) || (firstEntredNumber == lotteryNumberSecond && secondEntredNumber == lotteryNumberFirst)) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (firstEntredNumber == lotteryNumberFirst || secondEntredNumber == lotteryNumberSecond || firstEntredNumber == lotteryNumberSecond || secondEntredNumber == lotteryNumberFirst) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }
}
