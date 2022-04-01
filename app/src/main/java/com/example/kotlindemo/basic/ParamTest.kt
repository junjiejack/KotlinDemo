package com.example.kotlindemo.basic

/**
 * name：zjj
 * date：2022/4/1
 * desc：具名参数&&默认参数&&可变参数
 */

// 具名参数
class Person(val name: String,val age : Int)

// 默认参数
class Student(val name : String = "张三",val age: Int)

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

}