package org.example.lesson_10

/*Реализуй механизм авторизации в интернет-магазине и получения
сохраненного ранее списка товаров.

Метод авторизации принимает логин и пароль, верифицирует пользователя.
 Креды (credentials) для входа сохрани в константы.

При успешной авторизации – метод генерирует и возвращает токен доступа.
 Токен - текстовая строка, генерируемая методом авторизации (32 символа,
  которые включают цифры и буквы англ. алфавита – специальные библиотеки
  использовать не нужно).
   Подробнее https://ru.wikipedia.org/wiki/JSON_Web_Token

При неудачной авторизации метод возвращает null.

Метод получения корзины должен принимать токен и возвращать
список товаров (содержимое переменной корзины, произвольный тип данных).

Распечатай содержимое корзины или, если вернется null,
 оповести пользователя о неудачной авторизации. Переменные логин и пароль
  для корректной авторизации проинициализированы заранее и неизменяемы.*/

fun main() {
    print("Введите логин: ")
    val loginEnter = readln()
    print("Введите пароль: ")
    val passworEnter = readln()

    val token = autorizationCycle(loginEnter, passworEnter)

    val welcomeOrNoTrespassing = enterShop(token)
    print(welcomeOrNoTrespassing)
}

fun enterShop(_token: String?): String {
    val autorizationMessage: String
    if (_token == null) {
        autorizationMessage = "Доступ в наш магазин вам недоступен!\n" +
                                "Авторизируйтесь корректно."
    }    else {
        autorizationMessage = "Добро пожаловать!\n" +
                "В нашем магазине вы можете выбрать: \n" +
                "Лодки, палатки, гидрокостюмы, большой набор удочек и снастей"
    }
    return autorizationMessage
}

fun autorizationCycle(_loginEnter: String?, _enterPassword: String?): String? {
    val enterToken = mutableListOf<Char>()
    val symbolsAlpahbet = 'a'..'z'
    val symbolsAlphabetUpper = 'A'..'Z'
    val symbolsNumber = '0'..'9'
    if (_loginEnter == AUTORIZED_LOGIN && _enterPassword == AUTORIZED_PASSWORD) {
        for (i in 1..SYMBOLS_IN_TOKEN) {
            val newSymbols = (symbolsAlpahbet + symbolsAlphabetUpper + symbolsNumber).random()
            enterToken.add(newSymbols)
        }
    } else {
        return null
    }
    return enterToken.joinToString(separator = ", ")
}

const val AUTORIZED_LOGIN = "Dr.Grobov"

const val AUTORIZED_PASSWORD = "nEmoEv%2007$"

const val SYMBOLS_IN_TOKEN = 32