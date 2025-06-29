package org.example.lesson_3

/*Продолжаем работать над приложением “Шахматы”. Напиши программу для сервера,
 которая примет строку, отправленную игроком (считаем эти данные уже известными
 и объявляем строку с данными: “D3-D4;0”.

Необходимо будет сделать обратное. Распарсить строку – разбить ее на 3 составляющих:
 откуда, куда и номер хода, присвоить соответствующим переменным и распечатать по отдельности*/

fun main() {
    val stepChess = "D3-D4;0"
    val rasparsingStepChess = stepChess.split("-", ";")

    val startStep = rasparsingStepChess[0]
    val finishStep = rasparsingStepChess[1]
    val numberStep = rasparsingStepChess[2]

    println(startStep)
    println(finishStep)
    println(numberStep)
}