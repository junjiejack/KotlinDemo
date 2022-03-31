package com.example.kotlindemo.compain

fun main() {
    // 1. 工厂构造
    val txUser = User.getTencentUser("qq")
    println(txUser.name)
    val wbUser = User.getWeiboUser(17683887003)
    // 2. 单例设计
    val s1 = SingletonTest
    val s2 = SingletonTest
    println(s1 == s2)
}

object SingletonTest {
    fun action() {
        println("单例设计模式")
    }
}


// 工厂构造
class User private constructor(val account: String) {

    val name: String = "name"
        get() {
            return field.plus("age")
        }

    companion object {
        fun getTencentUser(account: String): User {
            return User(account)
        }

        fun getWeiboUser(phone: Long): User {
            return User(phone.toString())
        }
    }

}