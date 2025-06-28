package org.example.lesson_4

/*Научно-исследовательский корабль может приступить к долгосрочному плаванию
 при выполнении следующих условий:

- корабль не имеет повреждений;
- число экипажа составляет от 55 (включительно) до 70 человек (включительно);
- на борту есть более 50 ящиков провизии (не включительно);
- погода благоприятна или неблагоприятна.

Альтернативно, корабль может отплыть даже при наличии незначительных повреждений,
 при условии что:

- на борту рекомендованный состав экипажа 70 человек;
- погода благоприятная;
- на борту есть 50 и более ящиков провизии.

В качестве входных данных используй информацию, введенную через консоль:

- наличие повреждений корпуса (Boolean переменная);
- текущий состав экипажа;
- количество ящиков с провизией на борту;
- благоприятность метеоусловий (Boolean переменная).

Напиши программу, которая будет определять, может ли корабль отправиться в плавание.
Программа должна анализировать эти данные и выводить результат в консоль.
Для анализа должно использоваться единое составное условие, состоящие только из
логических операторов.*/

fun main() {
    val letsGoCapitan: Boolean

    println("Введите результат диагностики целостности корпуса корабля: false/true")
    val caseIsServiceable: Boolean = readln().toBoolean()

    println("Первый помошник, отчитайтесь о количестве экипажа на борту")
    val shipCrew: Int = readln().toInt()

    println("Суперкарго, отчитайтесь о количестве провизии на борту")
    val boxesOnBoard: Int = readln().toInt()

    println("Эй, на берегу. Погода позволяет оправится в путь? false/true")
    val relevantWeatherCondition: Boolean = readln().toBoolean()

    letsGoCapitan = ((caseIsServiceable == REQUIRED_CONDITION) && (shipCrew in (MINIMMUM_CREW..MAXIMUM_CREW)  &&
            (boxesOnBoard >= MINIMUM_BOXES) && (relevantWeatherCondition == REQUIRED_CONDITION)) ||
            ((shipCrew == MAXIMUM_CREW) && (relevantWeatherCondition == REQUIRED_CONDITION) && boxesOnBoard >= MINIMUM_BOXES))

    println("От винта: $letsGoCapitan")

}
const val MINIMMUM_CREW = 55
const val MAXIMUM_CREW = 70
const val MINIMUM_BOXES = 50
const val REQUIRED_CONDITION = true