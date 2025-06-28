package org.example.lesson_22

/*
Скопируй классы из предыдущей задачи и измени их названия для избегания конфликтов.

Создай по одному экземпляру каждого класса и выведи их в консоль (объект целиком).
Объясни разницу в выводе, используя комментарий в коде.*/

fun main() {
    val book1 = RegullarBook("Лестница в небо", "Хазин")
    val book2 = DattaBook("Лестница в небо", "Хазин")

    println(book1)// выводится адрес ячейки, потому что это стандартный класс
    println(book2)// выводятся истинные значения.
    println(book1.toString())// выводятся истинные названия ячеек через переопределенную функцию toString()
}

class RegullarBook(
    val name: String,
    val autor: String,
)  {
    override fun toString(): String {
        return "RegullarBook(name='$name', autor='$autor')"
    }
}

data class DattaBook(
    val name: String,
    val autor: String,
)