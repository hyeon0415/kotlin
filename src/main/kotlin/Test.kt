
fun main(){
//    max(3, 2)
//    repeat("양현", 4, false)
//    printNameAndGender(name = "양현", gender = "MALE")
//    printAll("A", "B", "C")
    val array = arrayOf("A", "B", "C")
    // 가변인자는 앞에 *를 붙여야함
    printAll(*array)
}

//fun max(a: Int, b: Int): Int {
//    return if (a > b) {
//       a
//    } else {
//       b
//    }
//}

//fun max(a: Int, b: Int) = if (a > b) a else b

fun repeat2(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNameAndGender2(name: String, gender: String) {
    println(name)
    println(gender)
}

fun printAll2(vararg strings: String) {
    for(str in strings) {
        println(str)
    }
}