package com.example.kotlindemo.outin

import java.lang.IndexOutOfBoundsException

open class Fruit(val name: String)

class Banner(name: String) : Fruit(name)

class Apple(name: String) : Fruit(name)


/**
 * 协变out&逆变in统称为型变
 */

/**
 * 声明处型变
 * 使用处型变
 */
// 协变out只能作为消费者,只能读取不能添加
interface ReadableList<out T> {

    fun get(index: Int): T

    fun add(any : Any) : Int

    // 不能修改,会报错
//    fun add(t: T): Int
}

// 逆变只能作为生产者,只能添加,读取受限
interface WritableList<in T> {

    // 不能读取,会报错
//    fun get(index: Int): T

    fun get(index: Int): Any

    fun add(t: T): Int

}

// in版本
fun <T> copyIn(dest : Array<in T>,src: Array<T>) {
    if (dest.size < src.size) {
        throw IndexOutOfBoundsException()
    } else {
        src.forEachIndexed { index, _ ->
            dest[index] = src[index]
        }
    }

}

// out版本
fun <T> copyOut(dest: Array<T>,src: Array<out T>) {
    if(dest.size < src.size) {
        throw IndexOutOfBoundsException()
    } else {
        src.forEachIndexed {index,_ ->
            dest[index] = src[index]
        }
    }
}

fun main() {
    val dest = arrayOfNulls<Number>(3)
    val src = arrayOf(1.0,2.0,3.0)
    copyIn(dest,src)
    copyOut(dest,src)

    // 使用*来表示类型通配符
    val list : MutableList<*> = mutableListOf(1,"str")
}


