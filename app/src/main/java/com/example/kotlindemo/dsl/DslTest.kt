package com.example.kotlindemo.dsl


class HtmlDSL : HtmlTagDsl("html")
class HeadDSL : HtmlTagDsl("head")
class BodyDSL : HtmlTagDsl("body")


open class HtmlTagDsl(var name: String) {

    private val list = ArrayList<HtmlTagDsl>()

    fun addChild(tagDsl: HtmlTagDsl) {
        list.add(tagDsl)
    }

    override fun toString(): String {
        return StringBuffer().apply {
            append("<$name>")
            list.forEach {
                append(it.toString())
            }
            append("</$name>")
        }.toString()
    }

}

class TitleDsl : HtmlTagDsl("title") {
    var title: String? = null
    override fun toString(): String {
        return "<title>$title<title>"
    }
}

fun html(block: HtmlDSL.() -> Unit): HtmlTagDsl {
    return HtmlDSL().apply(block)
}

fun HtmlDSL.head(block: HeadDSL.() -> Unit) {
    addChild(HeadDSL().apply(block))
}

fun HeadDSL.title(block: TitleDsl.() -> Unit) {
    addChild(TitleDsl().apply(block))
}

fun HtmlDSL.body(block: BodyDSL.() -> Unit) {
    addChild(BodyDSL().apply(block))
}

fun main() {
    val result = html {
        // 扩展函数
        head {
            title {
                title = " 你好"
            }
        }
        body {
        }
    }
    println(result)
}
