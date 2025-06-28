package org.example.lesson_5

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements

/*Парсер сайта. Видео гайд по парсингу: https://vk.cc/cEQsA0

Задача написать консольную программу, которая подключается к веб-странице и вытаскивает
цитаты из произведения "Автостопом по галактике" Дугласа Адамса. Программа должна выполнить HTTP-запрос,
получить HTML-контент страницы, найти цитаты и вывести их на экран.

Требования к задаче:

- Создай проект в отдельном репозитории, но с рабочей веткой, чтобы можно было отправить Pull Request на код-ревью;

- Подключись к URL страницы с цитатами:
https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/;

- Используй библиотеку Jsoup для выполнения HTTP-запроса и парсинга HTML;

- Найди на странице тэг, в которых хранятся цитаты;

- Извлеки текст из каждого элемента (только с первой страницы) и выведи его на экран.*/

fun main() {
    val doc: Document = Jsoup.connect("https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/").get()
    val newsHeadLine: Elements = doc.select("#mp-itn b a")
     for (headLine: Element in newsHeadLine) {
        println("${headLine.attr("sc-2aegk7-2 bzpNIu")}\n\t${headLine.absUrl("href")}")
     }

}

// так и не понял что вставлять в attr, а что в absUrl
// у меня приложение ничего не вывело, но и ошибок не дало.