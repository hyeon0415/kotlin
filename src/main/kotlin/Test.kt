
fun main(args: Array<String>) {
    judgeNum2(-2)
}

fun validateScore2(score: Int) {
//    if(score < 0) {
//        throw IllegalAccessException("${score}는 0보다 작을 수 없습니다")
//    }
    if(score !in 0..100) {
        throw IllegalAccessException("score의 범위는 0~100 사이입니다.")
    }
}

fun getPassOrFail2(score: Int): String {
    return if(score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade2(score: Int): String {
    return if(score >= 90) {
        "A"
    } else if(score >= 80) {
        "B"
    } else if(score >= 70) {
        "C"
    } else {
        "D"
    }
}

fun getGradeWithSwitch2(score: Int): String {
//    return when (score / 10) {
//        9 -> "A"
//        8 -> "B"
//        7 -> "C"
//        else -> "D"
//    }
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun startsWithB(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("B")
        else -> false
    }
}

fun judgeNum(number: Int) {
    when (number) {
        1, 0, -1 -> println("어디서 많이 본 숫자")
        else -> println("1, 0, -1이 아닙니다")
    }
}

fun judgeNum2(number: Int) {
    when {
        number < 0 -> println("양수만 입력 가능합니다")
        number == 0 -> println("주어진 숫자는 0입니다")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다")
        else -> println("주어진 숫자는 홀수입니다")
    }
}
