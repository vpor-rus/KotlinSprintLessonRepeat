package org.example.lesson_11

/*Прокачиваем абстрактное мышление. Задача на проектирование сущностей для упрощенной
 версии приложения социальной сети, в которой общаются только голосом. Требуется описать
  сущности и имитировать действия методами.

Функционал одного из модулей будет такой. Есть лента, в которой отображаются “комнаты”
 для общения по интересам. В карточке “комнаты” отображается:

- обложка;
- название;
- список участников — отображаются в виде аватарок. При долгом нажатии на аватар подсветится его
никнейм. Рядом с аватаркой отображается текстовый бейдж с одним из возможных статусов
говорящего: “разговаривает”, “микрофон выключен”, “пользователь заглушен”.

Класс должен содержать методы:

– добавления участника (принимает объект участника и сохраняет в свойство комнаты);
– обновления статуса (принимает имя пользователя и новый статус).

После проектирования создай объект комнаты с произвольными данными.*/

fun main() {
    val user1 = UserInChatRoom(
        avatar = "avatar1",
        nikName = "malvina",
        statusUser = "разговаривает",
    )

    val user2 = UserInChatRoom(
        avatar = "avatar2",
        nikName = "artamon",
        statusUser = "пользователь заглушен",
    )

    val user3 = UserInChatRoom(
        avatar = "avatar3",
        nikName = "pyero",
        statusUser = "микрофон заглушен",
    )

    val chatRoom1 = ChatRoom(
        cover = "COVER",
        name = "chatRoom_1",
        listOfParticipiants = mutableListOf(user1, user2, user3)
    )
    println(chatRoom1.listOfParticipiants[0].avatar)
    println(chatRoom1.listOfParticipiants[0].nikName)
    println(chatRoom1.listOfParticipiants[0].statusUser)
}

class ChatRoom(
    val cover: String,
    val name: String,
    val listOfParticipiants: MutableList<UserInChatRoom>,
) {
    fun addNewUser() {
        listOfParticipiants.add(
            UserInChatRoom(
                avatar = readln(),
                nikName = readln(),
                statusUser = readln(),
            )
        )
    }
}

class UserInChatRoom(
    val avatar: String,
    var nikName: String,
    var statusUser: String,
) {
    fun newNameAndStatus() {
        nikName = readln()
        statusUser = readln()
    }
}
