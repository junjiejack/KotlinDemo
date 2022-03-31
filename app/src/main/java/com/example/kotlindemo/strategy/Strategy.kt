package com.example.kotlindemo.strategy

class ContextKotlin() {

    fun perform(strategy: () -> Unit){
        strategy()
    }

}

fun main() {
    val t = ContextKotlin()
    t.perform {
        println("strategy_1")
    }
    val strategy = {
        println("strategy_2")
    }
    t.perform(strategy)
}