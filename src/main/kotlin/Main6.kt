import java.lang.IllegalArgumentException
import java.lang.NumberFormatException as NumberFormatException1

//fun parseIntOrThrow(str: String): Int {
//    try {
//        return str.toInt()
//    } catch (e: NumberFormatException) {
//        throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다")
//    }
//}

fun parseIntoOrThrow2(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException1) {
        null
    }
}