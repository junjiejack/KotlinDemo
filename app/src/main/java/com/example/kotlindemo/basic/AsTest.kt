package com.example.kotlindemo.basic

/**
 * name：zjj
 * date：2022/3/31
 * desc：类型转换
 */
fun main() {

    val a = "1"

    /*// null: 判断String是不是Int类型,显然不是,所以返回null
    val b : Int? = a as? Int
    // 1 : Integer.parseInt(a)
    val c : Int = a.toInt()
    println("b:$b,c:$c")*/

    /*// elvis 操作符
    val name : String? = null
    val length = name?.length ?: name?.length
    println("length:$length")*/

    // 非空断言
    var assertString : String? = null
    var str = assertString!!.length
    // 报错: NPE

}