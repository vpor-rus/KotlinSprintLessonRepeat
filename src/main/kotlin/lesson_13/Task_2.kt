package org.example.lesson_13

/*
Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.
На его основе создай экземпляр. Для поля с названием компании значение по умолчанию должно быть null.
Дополни класс методом, который будет печатать информацию о контакте сообщением в одном println() и без использования многострочного ввода такого типа (пример):
- Имя: Ростислав
- Номер: 89123456789
- Компания: Reddit
Вместо null значения, в консоль должна выводиться строка <не указано>.*/

fun main() {
    val contact1 = PhoneDirectori(
        name = "Кузнечик",
        phoneNumber = 89241987654,
        companiName = null,
    )

    contact1.outputData()
}

class PhoneDirectori(
    val name: String,
    val phoneNumber: Long,
    val companiName: String?,
) {
    fun outputData() {
        println(" Имя: $name\n Номер: $phoneNumber\n Компания: ${companiName?: "<не указано>"}")
    }
}