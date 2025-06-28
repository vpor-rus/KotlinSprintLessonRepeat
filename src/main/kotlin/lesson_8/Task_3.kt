package org.example.lesson_8

/*Используй условие из предыдущей задачи. Нужно доработать код,
который проверяет наличие ингредиента в рецепте. Однако,
не используя цикл для поиска.*/

fun main() {
    val ingredientsForBimbimbab = arrayOf("Рис", "Морская капуста", "Яйцо", "Фарш", "Соль", "Перцовая паста")
    println("Какой продукт вас интересует?")
    val whatAreYourNeed = readln()

    if (ingredientsForBimbimbab.contains(whatAreYourNeed)) {
        println("Ингредиент $whatAreYourNeed в рецепте есть")
    } else {
        println("такого ингридиента в рецепте нет")
    }
}