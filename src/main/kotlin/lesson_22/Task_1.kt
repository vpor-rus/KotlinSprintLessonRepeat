package org.example.lesson_22

/*
Создай обычный класс RegularBook и data class DataBook, каждый из которых содержит два свойства: название и автор.

Создай по два экземпляра каждого класса с одинаковыми свойствами, а затем сравни их (экземпляры), используя оператор
сравнения.

Выведи результат сравнения в консоль для каждой пары объектов. Объясни разницу в выводе, используя комментарий в коде.*/

fun main() {
    val bookReg1 = RegularBook("Книга джунглей", "Киплинг")
    val bookReg2 = RegularBook("Война и мир", "Толстой")

    val bookData1 = DataBook("Книга джунглей", "Киплинг")
    val bookData2 = DataBook("Книга джунглей", "Киплинг")

    println(bookReg1 == bookReg2)//в данном случае сравниваются адреса ячеек, они разные, поэтому false.
    println(bookReg1 == bookData1)// в этом примере так же сравниваются адреса ячеек, false.
    println(bookData1 == bookData2)// сравниваются значения двух Data классов, они одинаковые, true.
}

class RegularBook(
    val name: String,
    val autor: String,
)

data class DataBook(
    val name: String,
    val autor: String,
)