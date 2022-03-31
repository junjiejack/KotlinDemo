package com.example.kotlindemo.basic

/**
 * name：zjj
 * date：2022/3/31
 * desc：类备注
 */
class BreakTest {

    fun printBreak() {
        var n = 5
        while (n > 0) {
            if (n == 3) {
                break
            }
            n--
        }
    }

}

fun main() {
    // 循环9 次，且步长为1 的递增，0..9 表示0～9，其中不包含数字9
    loop@ for (i in 0..9) {        //外层循环
        for (j in 0..i) {          //内层循环
            if (i > 4) {           //判断i 的值是否大于4
                break@loop         //跳出外层循环
            }
            print(" * ")           //打印*
        }
        print("\n")                //换行
    }
}