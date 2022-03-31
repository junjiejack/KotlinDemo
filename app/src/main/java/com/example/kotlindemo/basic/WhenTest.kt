package com.example.kotlindemo.basic

/**
 * name：zjj
 * date：2022/3/31
 * desc：when语法的使用
 *
 * 思考: 如何优化掉else引用
 *
 */
class WhenTest {

    // when表达式--获取周几
    fun getWeekDay(week: Int): String {
        return when (week) {
            1 -> "星期一"
            2 -> "星期二"
            3 -> "星期三"
            4 -> "星期四"
            5 -> "星期五"
            6 -> "星期六"
            7 -> "星期日"
            else -> "未知"
        }
    }

    // 获取季节: 多个目标值后面的执行语句是一样的，则可以把多个目标值放在一起，用逗号隔开。
    fun getSeason(month: Int): String {
        return when (month) {
            12, 1, 2 -> "冬季"
            3, 4, 5 -> "春季"
            6, 7, 8 -> "夏季"
            9, 10, 11 -> "秋季"
            else -> "未知"
        }
    }
}
