package org.example.lesson_20

//В приложении есть SplashScreen, который приветствует пользователя, обращаясь по имени.
//
//Напиши лямбда-функцию с явным указанием типа при ее объявлении, которая будет создавать строку с
//текстом «С наступающим Новым Годом, username!», где username – это имя пользователя. Выведи строку в консоль.

fun main() {
    val nameUser = readln()

    val gritingsUser:(String) -> Unit = {println("С наступающим Новым Годом, $nameUser")};

    gritingsUser(nameUser)

}


