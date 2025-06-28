package org.example.lesson_8

/*Напиши программу, которая должна создавать массив из определенного количества ингредиентов,
которые будет вводить пользователь.

- элементы вводятся по одному;
- перед вводом элементов сначала запрашивается количество планируемых ингредиентов;
- запрещено использовать список или динамический массив.

Выведи полученные ингредиенты в консоль через запятую.*/

fun main() {
    print("Введите количество ингридиентов: ")
    val numberIngredients = readln().toInt()
    val arrayIngredients = Array(numberIngredients) {""}

   for (i in 0 until numberIngredients) {
       print("Введите ингредиент: ")
       val newIngredient = readln()
       arrayIngredients[i] = newIngredient
   }

    println(arrayIngredients.joinToString())
}