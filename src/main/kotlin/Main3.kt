fun main() {
//    val money1 = JavaMoney(2_000L)
//    val money2 = JavaMoney(1_000L)
//
//    if(money1 > money2) {
//        println("money1이 money2보다 금액이 큽니다.")
//    }
//    val money1 = JavaMoney(1_000L)
//    val money2 = money1
//    val money3 = JavaMoney(1_000L)
//
//    // === 는 주소가 같냐는 뜻
//    println(money1 === money3)
//
//    println(money1 == money3)
//
//    // lazy 연산 (fun1()이 true면 뒤에것 실행 안하고 앞에거 바로 실행함)
//    if (fun1() || fun2()) {
//        println("본문")
//    }
    val money1 = Money(1_000L)
    val money2 = Money(2_000L)
    println(money1 + money2)
}

fun fun1(): Boolean {
    println("fun 1")
    return true
}

fun fun2(): Boolean {
    println("fun 2")
    return false
}