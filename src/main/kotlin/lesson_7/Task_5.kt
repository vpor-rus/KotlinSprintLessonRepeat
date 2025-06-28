package org.example.lesson_7

/*Создай программу, которая генерирует более сложные пароли.

– пароль должен содержать цифры, строчные и заглавные буквы
- должны присутствовать все три вида символов;
– цифры и буквы должны располагаться в случайном порядке;
– длина пароля должна задаваться пользователем;
– минимальная длина пароля 6 символов.*/

fun main() {
    val upperAlphabeticSymbols = 'A'..'Z'
    val lowerAlphabeticSymbols = 'a'..'z'
    val numberSymbols = '0'..'9'

    println("Введите необходимую длину пароля.\n Напоминаю, не менее 6 символов")
    val lenghtPassword = readln().toInt()
    val editPassword = mutableListOf<Char>()
    //ниже набор обязательных, теперь уже 3-х символов

        editPassword.add(upperAlphabeticSymbols.random())
        editPassword.add(lowerAlphabeticSymbols.random())
        editPassword.add(numberSymbols.random())

    //донабор символов более 3х
    val setSymbols = upperAlphabeticSymbols + lowerAlphabeticSymbols + numberSymbols

    for (i in 4 .. lenghtPassword) {
        editPassword.add(setSymbols.random())
    }

    editPassword.shuffle()
    println(editPassword.joinToString(separator = ""))
}