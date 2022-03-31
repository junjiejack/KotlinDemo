package com.example.kotlindemo.basic

/**
 * name：zjj
 * date：2022/3/31
 * desc：类备注
 */
class ForTest {

    // 1. For循环
    fun printFor() {
        val str = "HelloWorld"
        // 1. 使用ForEach
        str.forEach {
            println(it)
        }
        // 2,. 使用for循环
        for (s in str) {
            println(s)
        }
        // 3. 带角标
        str.forEachIndexed() { index, it ->
            println("index:$index,it:$it")
        }
    }

}