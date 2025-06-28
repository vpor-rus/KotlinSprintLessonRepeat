package org.example.lesson_4

/*
На территории агрокомплекса функционирует система автоматического мониторинга
 условий для роста растений. Напиши программу, которая будет определять,
 подходят ли текущие условия для успешного роста бобовых культур.

Критерии благоприятных условий включают:

- наличие солнечной погоды;
- открытый тент;
- влажность воздуха составляет 20%;
- текущее время года - не зима.

Программа должна выводить результат анализа условий в формате: “Благоприятные ли условия сейчас для роста бобовых? true/false”

Для проверки работы программы, инициализируй переменные следующими значениями:

- погода сегодня - солнечная;
- тент на данный момент - открыт;
- влажность воздуха - 20%;
- текущее время года - зима.

И типами данных - boolean, boolean, int, String.*/
fun main() {
    val illuminationToday = true
    val openingTentToday = true
    val airHumidityToday = 20
    val seasonToday = "Зима"

    val favorableConditions = illuminationToday == ILLUMINATION && openingTentToday == OPENING_TENT &&
            airHumidityToday == AIR_HUMIDITY && seasonToday !== SEASON
    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}

const val ILLUMINATION: Boolean = true
const val OPENING_TENT = true
const val AIR_HUMIDITY = 20
const val SEASON = "Зима"