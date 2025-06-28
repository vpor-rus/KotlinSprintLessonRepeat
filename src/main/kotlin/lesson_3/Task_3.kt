package org.example.lesson_3

/*Пишем программу, которая будет помогать учить таблицу умножения.
В отдельную переменную будет записываться число (объявить и проинициализировать),
 а выводиться будет таблица умножения для этого числа.
 Таблица должна корректно печататься, если в исходную переменную подставлять разные числа.

Пример вывода:
6 x 1 = 6
6 x 2 = 12
…
6 x 9 = 54*/
fun main() {
    val numberZorro = readln().toInt()

    println("$numberZorro * 1 = ${numberZorro * 1}\n" +
            "$numberZorro * 2 = ${numberZorro * 2}\n" +
            "$numberZorro * 3 = ${numberZorro * 3}\n" +
            "$numberZorro * 4 = ${numberZorro * 4}\n" +
            "$numberZorro * 5 = ${numberZorro * 5}\n" +
            "$numberZorro * 6 = ${numberZorro * 6}\n" +
            "$numberZorro * 7 = ${numberZorro * 7}\n" +
            "$numberZorro * 8 = ${numberZorro * 8}\n" +
            "$numberZorro * 9 = ${numberZorro * 9}\n")
}