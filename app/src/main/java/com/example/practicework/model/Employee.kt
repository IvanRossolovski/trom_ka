package com.example.practicework.model

class Employee(var headOfDep:Human):Human(firstName = "Ivan") {                                                            //Наследуем от класса Human
    var department:String = "Отдел кадров"

    override fun setDocumentNumber(id:Int) {                                                                    //Перезаписываем функцию из родительского класса
    println("Номер документа сотрудника это $id")
    }

}