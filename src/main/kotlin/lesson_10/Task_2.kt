package org.example.lesson_10

/*Для регистрации в приложении пользователь придумывает логин и пароль.
И логин, и пароль должны содержать в себе хотя бы 4 символа.
Если всё верно, программа выводит приветственное сообщение.

- считывай логин и пароль с консоли поочередно;
- вынеси в отдельную функцию валидацию длины введенных данных;
- если логин или пароль меньше 4 символов – вывести сообщение:
"Логин или пароль недостаточно длинные".
*/

fun main() {
    print("Введите логин:  ")
    val newLogin: String? = readln()
        var numberSimbolsOfWord = newLogin?.length
    needLenght(numberSimbolsOfWord)

    print("Введите пароль:  ")
    val newPassword: String? = readln()
    numberSimbolsOfWord = newPassword?.length
    needLenght(numberSimbolsOfWord)
}

fun needLenght(lenghtOfWord: Int?) {
    if (lenghtOfWord?: 0 < NEED_LENGHT_SYMBOLS) {
        println("Логин или пароль недостаточно длинные")
    }
}

const val NEED_LENGHT_SYMBOLS = 4