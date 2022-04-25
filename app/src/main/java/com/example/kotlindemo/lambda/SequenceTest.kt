package com.example.kotlindemo.lambda

/**
 * name：zjj
 * date：2022/4/15
 * desc：序列Sequence
 */
fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    list.asSequence().filter { it > 4 }.map { it * 2 }.toList().forEach {
        println("it:$it")
    }

    val naturalList = generateSequence(0) { it + 1 }
}