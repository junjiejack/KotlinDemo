package com.example.kotlindemo.day2

/**
 * name：zjj
 * date：2022/4/1
 * desc：具名参数&&默认参数&&可变参数
 */

// 具名参数
class Person(val name: String,val age : Int)

// 默认参数
class Student(val name : String = "张三",val age: Int)

// 注意: 当覆盖一个有默认参数值的方法时，必须从签名中省略默认参数值
open class A {
    // 默认参数
    open fun foo(i: Int = 10) { /*……*/
    }
}

class B : A() {
    override fun foo(i: Int) { /*……*/
    } // 不能有默认值
}

// 可变参数
class Num(vararg num : Int) {

    init {
        var result = 0
        num.forEach {
            result+= it
        }
        println("result:$result")
    }
}

fun main() {
    val person = Person(name = "张三",age = 18)

    val student = Student(age = 18)

    val num = Num(1,2,3)

    val intArray = intArrayOf(1,2,3)
    // * 只能展开数组,不能展开集合
    val num2 = Num(*intArray)
}