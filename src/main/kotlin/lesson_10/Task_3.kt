package org.example.lesson_10

/*Напиши программу, которая генерирует пароли. Пароль должен состоять из последовательно
чередующихся цифр и специальных символов. Например, 4#4%2!.

- пользователь сам задает длину пароля;
- для генерации пароля должна быть отдельная функция, принимающая целочисленное значение длины пароля
 и возвращающая готовый пароль;
- пароль должен содержать цифры от 0 до 9, специальные символы: !"#$%&'()*+,-./ и пробел
(всего 16 спецсимволов).*/

fun main() {
print("Введите длину пароля: ")
    val lenghtPassword = readln().toInt()
editPassword(lenghtPassword = lenghtPassword)
}

fun editPassword(lenghtPassword: Int) {
    for (i in 1..lenghtPassword) {
        val randomNumber: Char = ('0'..'9').random()
        val randomCharacter: Char = ('!'..'/').random()
        val listSymbolsPassword = mutableListOf<Char?>()
        if (i % DIVIDER_PARITY != EDIT_PARITY) {
            listSymbolsPassword.add(randomNumber)
        } else {
            listSymbolsPassword.add(randomCharacter)
        }
        print(listSymbolsPassword.joinToString(","))
    }
}

const val DIVIDER_PARITY = 2

const val EDIT_PARITY = 0