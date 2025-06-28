package org.example.lesson_7

/*Создай программу, которая генерирует шестизначные пароли. Пусть пароль будет состоять из чередующихся цифр
 и строчных букв латинского алфавита (без специальных символов). Например, k5p6m2. Выведи сгенерированный
 пароль в консоль.*/

fun main() {
    val setAlphabet = 'a'..'z'
    val setNumber = '0'..'9'

    var counter = 3
    val characterSet = mutableListOf<Char>()

    do {
        val randomOne = setAlphabet.random()
        characterSet.add(randomOne)
        val randomTwo = setNumber.random()
        characterSet.add(randomTwo)
        counter--
    } while (counter > 0)

    val editPassword = characterSet.joinToString(separator = "")
    println(editPassword)
}
