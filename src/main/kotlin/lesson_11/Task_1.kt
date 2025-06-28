package org.example.lesson_11

/*Создай класс, который будет хранить данные пользователя. В свойствах должна храниться информация об
уникальном идентификаторе, логине, пароле и почте. Названием может быть, например, User. Создай два
экземпляра класса с произвольными данными и выведи в консоль содержимое их полей.*/

fun main() {

    val user1 = User(
        id = 1,
        login = "kinoman",
        password = "qwerty",
        emailAdress = "kapitan@ochevidnost.com",
    )

    val superUser = User(
        id = 2,
        login = "loveMovy",
        password = "zxcvb",
        emailAdress = "poiuy@mnbv.com",
    )
    println("id user1: ${user1.id} ")
    println("login user1: ${user1.login} ")
    println("password user1: ${user1.password} ")
    println("email adress user1: ${user1.emailAdress}\n")

    println("id superUser: ${superUser.id}")
    println("login superUser: ${superUser.login}")
    println("password superUser: ${superUser.password}")
    println("email adress superUser: ${superUser.emailAdress}")
}

class User(
    val id: Int,
    val login: String,
    val password: String,
    val emailAdress: String,
)