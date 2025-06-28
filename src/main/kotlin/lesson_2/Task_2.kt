package org.example.lesson_2

/*В компании работало 50 человек с зарплатой по 30000 рублей.
Затем в компанию устроилось 30 стажеров, которым назначили зарплату в 20000 рублей каждому.
 Пишем часть гипотетического софта для бухгалтерии, который будет считать:

– Расходы на выплату зарплаты постоянных сотрудников;
– Общие расходы по ЗП после прихода стажеров;
– Среднюю ЗП одного сотрудника после устройства стажеров.

Каждый пункт посчитать и сохранить в переменную с соответствующим названием.
Все значения необходимо вывести в виде целых чисел.*/

fun main() {
    val numberSpecialists = 50
    val salarySpecialist = 30_000
    val numberNewEmployees = 30
    val salaryNewEmployees = 20_000

    val paymentSpecialists = numberSpecialists * salarySpecialist
    val paymentAll = paymentSpecialists + (numberNewEmployees * salaryNewEmployees)
    val paymentAverage = paymentAll / (numberNewEmployees + numberSpecialists)
    println("Расходы на выплату зарплаты постоянных сотрудников: $paymentSpecialists")
    println("Общие расходы по ЗП после прихода стажеров: $paymentAll")
    println("Среднюю ЗП одного сотрудника после устройства стажеров: $paymentAverage")
}