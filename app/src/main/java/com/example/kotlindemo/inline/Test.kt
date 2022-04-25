package com.example.kotlindemo.inline

/**
 * name：zjj
 * date：2022/4/15
 * desc：类备注
 */
fun main() {
    foo {
        println("dive into Kotlin")
    }
}

inline fun foo(block:()->Unit) {
    println("before block")
    block()
    println("end block")
}