package org.example.lesson_5

import kotlin.math.pow

/*Создай консольное приложение на Kotlin, которое будет рассчитывать индекс массы тела (ИМТ) пользователя
и определять категорию веса на основе полученного значения.
Запроси у пользователя его вес (в килограммах) и рост (в сантиметрах).
Вес и рост должны быть переменными типа Double или Float.
Преобразуй рост из сантиметров в метры. Используя формулу ИМТ,
рассчитай индекс массы тела: ИМТ = масса тела в кг / рост в метрах в квадрате.
Используй условные операторы для определения категории ИМТ и выведи сообщение с результатом:
- ИМТ < 18.5: Недостаточная масса тела
- 18.5 ≤ ИМТ < 25: Нормальная масса тела
- 25 ≤ ИМТ < 30: Избыточная масса тела
- ИМТ ≥ 30: Ожирение
В конце программа должна вывести рассчитанный ИМТ с точностью до двух знаков после запятой и соответствующую категорию веса.*/

fun main() {

    println("Введите ваш вес в килограммах")
    val bodyWeight = readln().toDouble()

    println("Введите ваш рост в сантиметрах")
    var bodyHeight = readln().toDouble()
    bodyHeight = bodyHeight / HEIGHT_SM_VS_METRS
    println("$bodyHeight")
    val bodyMassIndex: Double = bodyWeight / (bodyHeight.pow(2))

    println("%.2f".format(bodyMassIndex))

    if (bodyMassIndex < MIN_BMI) {
        println("Недостаточная масса тела")
    } else if (bodyMassIndex >= MIN_BMI && bodyMassIndex < MIDL_BMI) {
        println("Нормальная масса тела")
    } else if (bodyMassIndex >= MIDL_BMI && bodyMassIndex < MAX_BMI) {
        println("Избыточная масса тела")
    } else {
        println("Ожирение")
    }
}

const val HEIGHT_SM_VS_METRS = 100

const val MIN_BMI = 18.5
const val MIDL_BMI = 25.0
const val MAX_BMI = 30.0