package com.example.practicework.torun
import com.example.practicework.model.Employee
import com.example.practicework.model.Equipment
import com.example.practicework.model.Figure
import com.example.practicework.model.Human       //При помощи функции "Import" мы можем импортировать в котлин-файл различные классы. Импортируем класс "Human"



fun main(){
    val human1 = Human("Ivan")                                                          //Создаём переменную "human1", указывает тип "Human".
                                                                                                 //Стандартные методы заимствуются от базового класса "Unit"
    println(human1.firstName)
    human1.firstName = "Андрей"                                                                    //Переименовали для переменной "human1" поле "surName"
    println(human1.firstName)
    println(human1.age)
    human1.age = 30                                                                               //Изменили поле "age"


    val human2 = Human("Anna", "Petrova",true)                             //Создали элемент human2 через вторичный конструктор

    val employee = Employee(human1)
    employee.setDocumentNumber(4410)
    human1.setDocumentNumber(4410)
    println(Figure.CIRCLE.ruName)



}
