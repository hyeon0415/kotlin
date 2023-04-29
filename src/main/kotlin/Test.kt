
fun main(args: Array<String>) {
    val str: String? = "ABC"
    //println(str?.length)

    println(startsWith2("BC"))
}

// null이 들어오면 예외처리
fun startsWithB(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalAccessException("null이 들어왔습니다")
}

// null이 들어와도 되는경우
fun startsWithB2(str: String?): Boolean? {
    return str?.startsWith("A")
}

// null이 들어오면 false
fun startsWithB3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

// 절대 null이 들어올 수 없는 경우 (null이 아님을 확신해야함)
fun startsWith2(str: String?): Boolean {
    return str!!.startsWith("A")
}

