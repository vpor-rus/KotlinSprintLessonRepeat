package org.example.lesson_22

import java.time.LocalDate


/*
В Путеводитель для путешествующих автостопом по Галактике добавляется информация о месте или событии в галактике
в виде объектов.

Создай data class GalacticGuide cо свойствами:

- название места или события;
- описание места или события;
- дата и время события;
- расстояние места или события от Земли в световых годах.

Создай объект с информацией о звездной системе Alpha Centauri. Выведи информацию о месте, используя компонентные
функции data class.*/

fun main() {

    val alphaCentauri = GalacticGuide(
        "Альфа-Центавра",
        "Тройная звездная система в южном созвездии Центавра",
        LocalDate.of(1939, 11, 5),
        123_456_789_098
        )

    val (name, description,timeDescription, distanceFromPlaceToGround) = alphaCentauri
    println(name)
    println(description)
    println(timeDescription)
    println(distanceFromPlaceToGround)
}

data class GalacticGuide(
    val namePlace: String,
    val description: String,
    val timeDescription: LocalDate,
    val distanceFromPlaceToGround: Long,
)