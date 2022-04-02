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
class Person(val name: String) {
    // TODO : operator操作符的作用
    operator fun invoke() {
        println("my name is $name")
    }
}

// 扩展函数
fun String.lastChar(): Char = this[this.length - 1]


/**
 * 满足条件:
 * 1. 它们必须是成员函数或扩展函数。
 * 2. 它们必须只有一个参数。
 * 3. 其参数不得接受可变数量的参数且不能有默认值。
 *
 * 优先级:
 * 1. 中缀函数调用的优先级低于算术操作符、类型转换以及 rangeTo 操作符。
 * 2. 中缀函数调用的优先级高于布尔操作符 && 与 || 、 is- 与 in- 检测以及其他一些操作符
 *
 * 注意:
 * 中缀函数总是要求指定接收者与参数。
 */

class InfixTest {

    private infix fun test(str : String ) = println(str)

    fun build() {
        test("adb")
        this test "adb"
    }
}

/**---------------------DSL应用-------------------------*/

// infix 表示法
@RequiresApi(Build.VERSION_CODES.O)
fun infixTest() {
    val map = mapOf(1 to "hello", 2 to "world")
    val date = 1 天 前
    val str = "kotlin" should Start with "kot"
}

/**
 * val date = 1 天 前
 * 1. Int.天()为扩展函数
 * 2. 使用infix作为中缀调度
 */
object 前

@RequiresApi(Build.VERSION_CODES.O)
infix fun Int.天(ago: 前) = LocalDate.now() - Period.ofDays(this)


/**
"kotlin" should start with "kot"
// 等价于
"kotlin".should(start).with("kot")
 */
object Start

infix fun String.should(param: Start): String = ""
infix fun String.with(str: String): String = ""
