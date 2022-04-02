package com.example.kotlindemo.day2

/**
 * name：zjj
 * date：2022/4/2
 * desc：顶层函数&局部函数&递归函数&尾递归函数
 */
// 顶层函数&递归函数
fun sum(num: Int): Int {
    return if (num == 1) {
        num
    } else {
        num + sum(num - 1)
    }
}

// 尾递归函数
fun tailSum(num: Int, total: Int = 0): Int {
    return if (num == 1) {
        1 + total
    } else {
        tailSum(num - 1, num + total)
    }
}

// 尾递归函数优化
tailrec fun tailRecSum(num: Int, total: Int = 0): Int {
    return if (num == 1) {
        1 + total
    } else {
        tailRecSum(num - 1, num + total)
    }
}

// 局部函数
fun part(name: String) {

    val test: Int = 0

    fun segment(name: String) {
        println("可以访问局部变量:${test}")
    }
}


fun main() {
    println("递归函数:${sum(4)}")
    // 直接报错:StackOverflowError
    println("尾递归函数:${tailSum(100000)}")
    // 结果:705082704
    println("尾递归函数优化:${tailRecSum(100000)}")
}
