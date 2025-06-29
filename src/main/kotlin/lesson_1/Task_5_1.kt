package org.example.lesson_1

/*Объяви переменную с количеством секунд, которые Гагарин провел в космосе.

- Переведи в коде количество секунд(val seconds: Short = 6_480) в целые минуты и целые часы,
сохраняя остаток секунд и минут в новые переменные;
- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
- Значения часов, минут и секунд отображать двумя цифрами.

Отправить решение
*/

fun main() {
    val second: Short = 6_480
    val hours = second / SECOND_IN_ONE_HOUR
    val minute = (second % SECOND_IN_ONE_HOUR) / SECOND_IN_ONE_MINUTE
    val reminingsSecond = second - ((((second / SECOND_IN_ONE_HOUR) * SECOND_IN_ONE_HOUR) +
            ((second % SECOND_IN_ONE_HOUR) / SECOND_IN_ONE_MINUTE) * SECOND_IN_ONE_MINUTE))

   println("%02d:%02d:%02d".format(hours, minute, reminingsSecond))
}

const val SECOND_IN_ONE_MINUTE = 60

const val SECOND_IN_ONE_HOUR = 3600