package org.example.lesson_2

/*Сайт с расписанием поездов получает данные с сервера. Сервер посылает время выезда и время в пути,
 а время прибытия вычисляется из них. Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.

 – Создай целочисленные переменные и проинициализируй их этими данными;
 – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
 – Выведи результат в консоль.*/

fun main() {
    val hoursStart = 9
    val minutesStart = 39
    val travelInTime = 457

    val startTimeInMinutes = (hoursStart * MINUTES_VS_HOUR) + minutesStart

    val finishTimeInMinutes = startTimeInMinutes + travelInTime

    println("${finishTimeInMinutes / MINUTES_VS_HOUR} : ${finishTimeInMinutes % MINUTES_VS_HOUR}")
}
const val MINUTES_VS_HOUR = 60

