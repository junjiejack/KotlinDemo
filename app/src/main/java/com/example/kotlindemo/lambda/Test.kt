package com.example.kotlindemo.lambda

/**
 * name：zjj
 * date：2022/4/15
 * desc：类备注
 */
class Test {
}


class HTML {
    fun body() {}

    // HTML.()
    fun html(init: HTML.() -> Unit): HTML {
        val html = HTML()
        html.init()
        return html
    }

}


// 关于集合的api
fun main() {

    val array = listOf(1, 2, 3)

    // 求和: sum
    val sum = array.sum()
    println("sum:$sum")

    // fold --> 使用了递归的思想,有一个初始值
    val sum2 = array.fold(0) { acc, i ->
        acc + i
    }
    println("sum2:$sum2")

    // reduce --> 类似于fold,但是没有初始值
    val sum3 = array.reduce { acc, i ->
        acc + i
    }
    println("sum3:$sum3")

    // groupBy --> 分组

    // 扁平化: flatten & flatMap
}



