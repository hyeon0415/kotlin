fun main(args: Array<String>) {
    // Safe Call = null이 아니면 실행하고 null이면 실행하지 않는다.(그대로 null)
    // Elvis 연산자 = ? : 0 -> null이면 0이 된다
    val str: String? = null
    //str.length //불가능
    //println(str?.length ?: 0)

    println(startsWith("ABC"))
}

fun startsWithA(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalAccessException("null이 들어왔습니다")
    /*
    if(str == null){
        throw IllegalAccessException("null이 들어왔습니다")
    }
    return str.startsWith("A")
     */
}

// null이 들어와도 되는경우
fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
    /*
    if(str == null){
        return null
    }
    return str.startsWith("A")
     */
}

// null이 들어오면 false
fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
    /*
    if(str == null){
        return false
    }
    return str.startsWith("A")
     */
}

// 절대 null이 들어올 수 없는 경우 (null아님이 확실할때만 사용)
fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A")
}