package com.example.kotlindemo.extend

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate
import java.time.Period

fun main() {
//    println("hello".lastChar())
    val person = Person("Kevin")
    person()
}

// invoke约定
class Person(val name:String){
    // TODO : operator操作符的作用
    operator fun invoke(){
        println("my name is $name")
    }
}

// 扩展函数
fun String.lastChar() : Char = this[this.length-1]

// infix 测试代码
@RequiresApi(Build.VERSION_CODES.O)
fun infixTest() {
    val map = mapOf(1 to "hello", 2 to "world")
    val date = 1 天 前
    val str = "kotlin" should Start with "kot"
}


object 前
/**
 * 1. Int.天()为扩展函数
 * 2. 使用infix作为中缀调度
 */
@RequiresApi(Build.VERSION_CODES.O)
infix fun Int.天(ago:前) = LocalDate.now() - Period.ofDays(this)



/**
    "kotlin" should start with "kot"
    // 等价于
    "kotlin".should(start).with("kot")
 */
object Start
infix fun String.should(param : Start) : String = ""
infix fun String.with(str: String) : String = ""
