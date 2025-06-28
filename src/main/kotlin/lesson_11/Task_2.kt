package org.example.lesson_11

/*Скопируй класс User из первой задачи и назови User2. Добавь к классу новое необязательное
 свойство bio и несколько методов:

- вывод информации о пользователе в консоль;
- считывание из консоли текста и запись в поле bio;
- изменение пароля — сначала запросить текущий пароль, и, если он введен верно,
 запросить новый. Записать его в поле и сообщить, что пароль изменен;

Далее создай объект, заполни информацию “о себе” и замени пароль. В конце выведи
обновленную информацию о пользователе.*/

fun main() {

    val changeUser = User2(
        id = 1,
        login = "kot",
        password = "qwerty",
        emailAdress = "telepupkin@gim.com"
    )
    changeUser.changePassword()
    changeUser.userInformation()
}

class User2 (
    val id: Int,
    val login: String,
    var password: String,
    val emailAdress: String,
    var bio: String? = null,
) {
    fun userInformation() {
        println("User2 id: $id")
        println("User2 login: $login")
        println("User2 password: $password")
        println("User2 email adress: $emailAdress")
        if (bio != null) {
            println("User2 bio: $bio")
        }
    }

    fun fillingInBio() {
        bio = readln()
    }

    fun changePassword() {
        print("Введите пароль для подтверждения: ")
        val examinerPassword = readln()
        if (examinerPassword == password) {
            print("Введите новый пароль: ")
            password = readln()
            println("Пароль изменен")
        }
    }
}