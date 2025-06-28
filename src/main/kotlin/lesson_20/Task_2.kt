package org.example.lesson_20

/*
В компьютерной игре игрок может подобрать лечебное зелье, которое восстанавливает всё его здоровье.
Для реализации программы понадобится создать простой класс игрока (у него должно быть имя, текущее
и максимальное здоровье).

– Напиши лямбда-функцию с явным указанием типа переменной, реализующую лечебное зелье. Функция должна
принимать в качестве параметра объект игрока.
– Создай экземпляр игрока с неполным здоровьем, примени к нему созданную лямбду-функцию.*/

fun main() {
    val player1 = Gamer("первый игрок", 33)

    println(player1.healthLevel)
    val healtingToMax: (Gamer) -> Unit = { player -> player.healthLevel = player.maxHealth }
    healtingToMax(player1)
    println(player1.healthLevel)
}

private data class Gamer(
    val name: String,
    var healthLevel: Int,
    val maxHealth: Int = 100,
)