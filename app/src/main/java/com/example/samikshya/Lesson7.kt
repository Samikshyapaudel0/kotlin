package com.example.samikshya

import kotlin.random.Random

fun main() {
    print("Please enter a number : ")
    var number0: Any = readln( )!!.toInt()

    if (number0.toString().toInt() % 2 == 0) {
        println("$number0 is even")
    } else {
        println("$number0 is odd")
    }
    //if else if ladder statement
    print("Please enter your age ::")
    var yourAge: Int = readln()!!.toInt()
    if (yourAge < 13) {
        print("You are a teenager")
    } else if (yourAge < 19) {
        print("You are a teenager")
    } else {
        if (yourAge < 50) {
            print("You are an adult")
        } else {
            print("You are a senior")
        }
    }
    //nested if
    println("Please enter 3 numbers : ")
    var number1: Int = readln()!!.toInt()
    var number2: Int = readln()!!.toInt()
    var number3: Int = readln()!!.toInt()
    var largestNumber: Int
    if (number1 >= number2) {
        if (number1 >= number3) {
            largestNumber = number1
        } else {
            largestNumber = number3
        }
    } else {
        if (number2 >= number3) {
            largestNumber = number2
        } else {
            largestNumber = number3
        }
    }
    println("The largest number is $largestNumber")

    //when statement
    print("Please enter a day number of week : -")
    var dayNumber: Int = readln()!!.toInt()
    var day: String
    when (dayNumber) {
        1 -> day = "Sunday"
        2 -> day = "Monday"
        3 -> day = "Tuesday"
        4 -> day = "Wednesday"
        5 -> day = "Thursday"
        6 -> day = "Friday"
        7 -> day = "Saturday"
        else -> day = "Invalid day choice"
    }
    println(day)


    //For loop
    //for each loop
    var vehicle = arrayListOf< String>("Tata", "Kia", "Hyundai","MG")
    vehicle.forEach {
        println(it)
    }
    //while loop
    var i: Int = 0;
    while(i<5){
        println(i)
        i++
    }

    var k =1
    var fact = 1
    while(k < 6){
        fact *= k;
        println("$k! = $fact");
    }

    //Infinite loop
    var number = Random.nextInt(0, 10000)
    println("Please enter any number from 0 to 10000 : -")
    while(2>1){
        var userGuess: Int = readln()!!.toInt()
        if(userGuess == number) {
            println("Congratulations!!!!, you won")
            break
        }else if (userGuess< number) {
            println("Increase your guess")
        }else{
            println("Decrease your guess")
        }

    }

    //Do-while loop
    var number4 = 1
    do{
        println(number4)
        number4++

    }while (number4 <= 15)
}
