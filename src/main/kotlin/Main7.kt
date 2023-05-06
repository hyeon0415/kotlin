
fun main() {
    // named argument
    //printNameAndGender(name="최태현", gender = "MALE")

    // Java함수 가져다 쓸때 named argument 못씀
    //Lec08Main.repeat(str = "A")

    printAll("A", "B", "C")

    val array = arrayOf("A", "B", "C")
    printAll(*array)
}

//fun max(a: Int, b: Int): Int {
//    return if (a > b) {
//        a
//    } else {
//        b
//    }
//}

//fun max(a: Int, b: Int) = if (a > b) a else b

//반환타입은 Unit이라 생략가능
// num 기본값은 3, useNewLine 기본값은 true라는 설정 = defalut parameter
fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for(i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}

