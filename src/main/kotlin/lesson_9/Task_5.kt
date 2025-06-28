package org.example.lesson_9

/*Напиши программу, которая запрашивает у пользователя пять названий ингредиентов (каждый по отдельности).

- результат должен исключать повторы;
- список должен выводиться в алфавитном порядке;
- все элементы списка выведены в одну строку, разделяя слова запятыми;
- первый элемент должен быть распечатан с заглавной буквы.*/

fun main() {
    val setFiveIngredients = mutableSetOf<String>()
    println("Введите пять названий ингредиентов (каждый по отдельности)")
    do {
        print("Введите ингредиент: ")
        val newIngredients = readln()
        setFiveIngredients.add(newIngredients)
    } while (setFiveIngredients.size < 5)

    val listFiveIngredients = setFiveIngredients.toMutableList()
    listFiveIngredients.sort()
    listFiveIngredients[0] = listFiveIngredients[0].replaceFirstChar { it.uppercase() }
    print(listFiveIngredients)
}
