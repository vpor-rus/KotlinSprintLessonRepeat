package org.example.lesson_21

/*
Игра имеет систему прокачки персонажей по различным навыкам. Опыт в каждом навыке хранится в виде пары ключ-значение,
где ключ — это название навыка (String), а значение — количество очков опыта (Int).

Создай extension функцию для интерфейса Map<String, Int> с названием maxCategory, которая будет возвращать название
навыка, в котором у игрока наибольшее количество очков опыта. Если два или более навыка имеют одинаковое максимальное
значение, функция должна возвращать первый найденный из них.*/

fun main() {

    val player1 = Gamer(
        "MrHVOST", mapOf(
            "stels" to 150,
            "shooting" to 100,
            "magic" to 30,
        )
    )

    println(player1)
}

data class Gamer(
    val name: String,
    val skills: Map<String, Int>,
)

fun Map<String, Int>.maxCategory(): String? {
    return this.maxByOrNull { it.value }?.key
}


