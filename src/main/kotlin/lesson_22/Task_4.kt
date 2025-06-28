package org.example.lesson_22

/*
В разработке Android приложений часто используется паттерн MVVM (Model-View-ViewModel) для разделения бизнес-логики
и пользовательского интерфейса. ViewModel отвечает за управление состоянием приложения и хранит данные,
которые необходимы для отображения на экране.

Предположим, что у нас есть MainScreenViewModel первого экрана приложения, для инициализации которого подгружаются
данные с сервера. ViewModel хранит единственное свойство mainScreenState, которое представляет собой объект
внутреннего data class MainScreenState.

Состояние экрана включает два свойства: data (загружаемые данные — String) и isLoading (индикатор процесса загрузки,
обычно имеет значение по умолчанию false).

Создайте data class для хранения состояния. При изменении состояния загрузки необходимо создать новый объект
MainScreenState, скопировав текущее состояние и изменив значение поля isLoading.

Создайте метод loadData() в классе MainScreenViewModel, который будет имитировать процесс загрузки данных с
сервера. Этот метод не должен принимать параметры и должен последовательно изменять состояние в следующем порядке:

- отсутствие данных;
- загрузка данных;
- наличие загруженных данных.*/

fun main() {
    val process = MainScreenViewModel()
    process.loadData()
}

data class MainScreenState(
    val data: String,
    val isLoading: Boolean = false,
)

class MainScreenViewModel {
    var mainScreenState = MainScreenState(
        data = "",
        isLoading = false,
    )

    fun loadData() {
        val dateInThisTask = "то что загружаю"
        mainScreenState = mainScreenState.copy(data = "", isLoading = false)
        println(mainScreenState)

        mainScreenState = mainScreenState.copy(data = "", isLoading = true)
        println(mainScreenState)

        mainScreenState = mainScreenState.copy(data = dateInThisTask, isLoading = false)
        println(mainScreenState)
    }


}
