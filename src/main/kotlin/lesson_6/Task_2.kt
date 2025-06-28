package org.example.lesson_6

/*Создай простой таймер, который запрашивает у пользователя количество секунд,
которые нужно засечь. По истечении заданного времени, выведется сообщение в консоли:
 “Прошло N секунд”. Где N – количество секунд, введенных пользователем.
 Программа должна вставать на паузу.*/

fun main() {
    println("Напишите время отсечки в секундах")
    val requiredTime = readln().toInt()
    val timeInMilliseconds = requiredTime * ONE_SECOND_TIME
    Thread.sleep(timeInMilliseconds)
    println("Прошло $requiredTime секунд(а)")
}

const val ONE_SECOND_TIME = 1000L