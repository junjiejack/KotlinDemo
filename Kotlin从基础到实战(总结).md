# Kotlin从基础到实战(读书总结)

## 一. Kotlin特点

- 简洁
- 安全
- 与Java互操作性

## 二. Kotlin基础


### 1. 数据类型

**Kotlin语言中的数据类型不区分基本数据类型和引用数据类型，分为<u>数值型、字符型、布尔型、数组型、字符串型</u>;**

- 数值型(大写):Byte（字节）、Short（短整型）、Int（整型）、Long（长整型）、Float（浮点型）、Double（双精度浮点型）
- 布尔型: Boolean
- 字符型: Char
- 数组型: Array(**Kotlin中不能使用stringArrayOf()方法创建字符串类型数组，因为String不属于基本数据类型。要想在Kotlin中声明字符串数组，需要使用Array＜String＞，并且对应的初始化数组的方法也相应变成了arrayOf()，这种初始化方式对于其他类型的数组同样适用**)

- 字符串型: String

>字符串是不可变的，字符串中的元素可以使用索引的形式进行访问：即“变量名+角标”的形式，如str[i]；也可以用for循环遍历字符串	
	
	// 字符串
    val str = "hello world"
    val str_2 = str[2]
    println("str index 2:$str_2")
    // 打印信息 str index 2 : l
    for (s in str) {
		// 字符串模板表达式由${变量名/函数/表达式}
        println("for循环:$s")
    }

	/**-----------------分割线------------------*/
	
	// 字符串分隔符:在Kotlin中，split()函数还可以传入多个拆分符，多个拆分符中间只需用逗号分隔即可
    val splitStr = "hello.kotlin/world"
    val split = splitStr.split(".", "/")
    println(split)
    // 打印信息: [hello, kotlin, world]

	/**-----------------分割线------------------*/

	// 字符串分隔符:在Kotlin中，split()函数还可以传入多个拆分符，多个拆分符中间只需用逗号分隔即可
    val splitStr = "hello.kotlin/world"
    val split = splitStr.split(".", "/")
    println(split)
    // 打印信息: [hello, kotlin, world]


> 转义符:采用反斜杠"\"方式将字符进行转义,长用转义如下

- \r：表示回车符，将光标定位到当前行的开头，不会跳到下一行
- \n：表示换行符，换到下一行开头。
- \t：表示制表符，将光标移动到下一个制表符的位置，类似在文档中用Tab键的效果。
- \b：表示退格符号，类似键盘上的Backspace键。
- \'：表示单引号字符，在Kotlin代码中单引号表示字符的开始和结束，如果直接写单引号字符（'），程序会认为前两个是一对，会报错，因此需要使用转义字符（\'）。
- \"：表示双引号字符，Kotlin中双引号表示字符串的开始和结束，包含在字符串中的双引号需要转义，比如""。
- \\：表示反斜杠字符，由于在Kotlin代码中的反斜杠（\）是转义字符，因此需要表示字面意义上的\，就需要使用双反斜杠（\\） 
- 原生字符串需要使用"""""",例如"""您 \n 好"""显示为 您\n好



### 2. 运算符

    // 取模--在进行取模（%）运算时，运算结果的正负取决于被模数（%左边的数）的符号，与模数（%右边的数）的符号无关。例如（-1）%2=-1，而1%（-2）=1。
    val m1 = 1000 % 3
    val m2 = -1000 % 3
    val m3 = 1000 % -3
    println("m1:$m1,m2:$m2,m3:$m3")
    // 打印信息: m1:1,m2:-1,m3:1

### 3. 空值处理

#### 1) 可空类型变量(?)

	var name : String? = null

#### 2) 安全调用符 (?.)

	var name : String? = null
	var length = name?.length
	// 跟Java中的
	if (null != name) {
		int length = name.length
	}

#### 3) Elvis操作符(?:)

> 语法格式为“表达式?:表达式”。如果左侧表达式非空，则返回左侧表达式的值，否则返回右侧表达式的值。当且仅当左侧为空时，才会对右侧表达式求值。

    val name : String? = null
    val length = name?.length ?: name?.length
    println("length:$length")

#### 4) 非空断言(!!.)

> “变量!!.成员”。非空断言（!!.）会将任何变量（可空类型变量或者非空类型变量）转换为非空类型的变量，若该变量为空则抛出异常	

	// 非空断言
    var assertString : String? = null
    var str = assertString!!.length
    // 报错: NPE