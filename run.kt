package com.newproject.animalstorun
import  com.newproject.animals.Herbivore
import  com.newproject.animals.Carnivore



fun main(){

    val herbivore1 = Herbivore("leaves","giraffe")

    val herbivore2 = Herbivore("grass","horse")

    val herbList =  listOf(herbivore1,herbivore2)

    val carnivore1 = Carnivore("meat","wolf")

    val carnivore2 = Carnivore("meat","lion")

    val carnList =  listOf(carnivore1,carnivore2)

    println(herbList[0].herbivoreRepresentative)
    println(herbList[0].herbivoreFood)
    println(herbList[1].herbivoreRepresentative)
    println(herbList[1].herbivoreFood)
    println(carnList[0].carnivoreFood)
    println(carnList[0].carnivoreRepresentative)
    println(carnList[1].carnivoreFood)
    println(carnList[1].carnivoreRepresentative)
}