package org.example.lesson_22

/*Используя любой data class, в котором есть минимум 3 свойства, выполни деструктуризацию объекта на
переменные и выведи их значения в консоль.*/

fun main() {
    val oneTask = FreeClass("первый", 2, true)

    val (name, freeNumber, freeBoolean) = oneTask
    println(name)
    println(freeNumber)
    println(freeBoolean)

}

data class FreeClass(
    val name: String,
    val freeNumber: Int,
    val freeBoolean: Boolean,
)