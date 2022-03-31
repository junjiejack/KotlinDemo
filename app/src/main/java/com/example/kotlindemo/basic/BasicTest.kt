package com.example.kotlindemo.basic

/**
 * name：zjj
 * date：2022/3/31
 * desc：基础语法,和Java有所不同的
 */
fun main() {

    /*// 取模--在进行取模（%）运算时，运算结果的正负取决于被模数（%左边的数）的符号，与模数（%右边的数）的符号无关。例如（-1）%2=-1，而1%（-2）=1。
    val m1 = 1000 % 3
    val m2 = -1000 % 3
    val m3 = 1000 % -3
    println("m1:$m1,m2:$m2,m3:$m3")
    // 打印信息: m1:1,m2:-1,m3:1*/

    /*    // 字符串
    val str = "hello world"
    val str_2 = str[2]
    println("str index 2:$str_2")
    // 打印信息 str index 2 : l
    for (s in str) {
        println("for循环:$s")
    }*/

    // 字符串分隔符:在Kotlin中，split()函数还可以传入多个拆分符，多个拆分符中间只需用逗号分隔即可
    val splitStr = "hello.kotlin/world"
    val split = splitStr.split(".", "/")
    println(split)
    // 打印信息: [hello, kotlin, world]

    // 去空格:trim()、trimEnd()等多个函数，其中trim()用于删除字符串前面的空格，trimEnd()用于删除字符串后面的字符
    val str = "         Hello World!         "
    println(str.trim())
    println(str.trimEnd())
    // 打印信息
    // Hello World!
    //         Hello World!


    // Java中的三元换算符->  判断条件 ?  表达式1 : 表达式2
    // Kotlin中-> if 判断条件 表达式1 else 表达式2
    val a = 1
    val b = 10
    val max = if (a > b) a else b
    print("max=$max")


}