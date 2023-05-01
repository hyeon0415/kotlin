
fun main(args: Array<String>) {
//    val money1 = JavaMoney(2_000L)
//    val money2 = JavaMoney(1_000L)
//
//    if(money1 > money2) {
//        println("money1이 money2보다 금액이 큽니다.")
//    } else {
//        println("아님 말고")
//    }

//    val money1 = JavaMoney(1_000L)
//    val money2 = money1
//    val money3 = JavaMoney(1_000L)
//
//    println(money1 === money3)
//
//    println(money1 == money3)
    //lazy 연산 ( 조건에서 앞에거가 맞으면 앞에거 실행하고 뒤에거 실행 안함 )
//    if(fun1() || fun2()) {
//        println("본문")
//    }

    val money1 = Money(1_000L)
    val money2 = Money(2_000L)

    // Kotlin은 객체마다 연산자를 직접 정의할 수 있다.
    println(money1 + money2)
}

fun fun11(): Boolean {
    println("fun 1")
    return true
}

fun fun22(): Boolean {
    println("fun 2")
    return false
}


