package org.example.lesson_1

/*Объяви переменную с количеством секунд, которые Гагарин провел в космосе.

- Переведи в коде количество секунд(val seconds: Short = 6_480) в целые минуты и целые часы,
сохраняя остаток секунд и минут в новые переменные;
- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
- Значения часов, минут и секунд отображать двумя цифрами.

Отправить решение
*/

fun main () {
    val second = 6_480
    val minutes = second / MINUTE_VS_SECOND_AND_MINURES_VS_HOUR
    val hours = second / HOUR_VS_SECOND
    val remainingSeconds = second - (minutes * MINUTE_VS_SECOND_AND_MINURES_VS_HOUR)
    val remainingMinutes = minutes - (hours * MINUTE_VS_SECOND_AND_MINURES_VS_HOUR)

    println("%02d:%02d:%02d".format(hours, remainingMinutes, remainingSeconds))
}

const val MINUTE_VS_SECOND_AND_MINURES_VS_HOUR = 60
const val HOUR_VS_SECOND = 3600