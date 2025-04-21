package com.example.samikshya

fun main(){
    fun show(a: Int, b: Int): Unit {
        println("You entered $a and $b")
    }
    fun add(a: Int, b: Int): Int{
        var sum = 0
        sum = a+b
        return sum
    }

    fun findMinimumNumber(a: Int, b: Int): Int{
        var  minimum = 0
        if (a>b) {
            minimum = b
        } else {
            minimum = a
        }
        return minimum
    }
}