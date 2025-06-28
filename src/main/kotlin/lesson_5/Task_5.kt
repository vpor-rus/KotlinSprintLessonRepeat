package org.example.lesson_5

import kotlin.random.Random

/*Для алгоритма улучшенного приложения-лотереи нужно угадать три числа от 0 до 42.
 Пользователь вводит числа через консоль.

Требования к программе:

- Загаданные числа должны рандомно генерироваться при каждом запуске программы и храниться
в списке.
- Поочередно введенные пользователем числа должны также храниться в списке.
- Для определения совпадений используй метод intersect() и сохрани размер
полученной коллекции в отдельную переменную.

В зависимости от количества угаданных чисел программа выводит результат:

- При трех совпадениях сообщается, что пользователь угадал все числа и выиграл джекпот.
- При двух совпадениях информируется о том, что пользователь угадал два числа и получает крупный приз.
- Если угадано одно число, пользователю выплачивается утешительный приз.
- Если нет совпадений, программа сообщает, что пользователь не угадал ни одного числа.
- В конце игры вне зависимости от результата программа выводит выигрышные числа.*/

fun main() {
val firstRandom = Random.nextInt(0,42)
val secondRandom = Random.nextInt(0,42)
val thirdRandom = Random.nextInt(0,42)
    val listRandom = mutableListOf(firstRandom, secondRandom, thirdRandom)
        println("Выведение значений списка для возможности проверки программы: $listRandom")

val firstAttempt = readln().toInt()
val secondAttempt = readln().toInt()
val thirdAttempt = readln().toInt()
    val listAttempts = mutableListOf(firstAttempt, secondAttempt, thirdAttempt)

    val coincindences = listRandom.intersect(listAttempts)

    var totalCalculating = 0

    coincindences.forEach {
        totalCalculating = totalCalculating + 1
    }

   if (totalCalculating == 0) {
       println("Пользователь не угадал ни одного числа")
   } else if (totalCalculating == 1) {
       println("Вам выплачивается утешительный приз")
   } else if (totalCalculating == 2) {
       println("Вы угадали два числа и получаете крупный приз")
   } else {println("вы угадали все числа и выиграли джекпот")}


}