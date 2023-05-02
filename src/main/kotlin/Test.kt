
fun main(){
//    val numbers = listOf(1L, 2L, 3L)
    // Kotlin의 반복문(for)은 in으로 설정
//    for (number in numbers) {
//        println(number)
//    }

    // 1~3까지 출력
//    for(i in 1..3) {
//        println(i)
//    }

    // 3 -> 1까지 내려가는 출력
//    for(i in 3 downTo 1) {
//        println(i)
//    }

    // 1 ~ 5까지 2씩 올라감
//    for(i in 1..5 step 2) {
//        println(i)
//    }

    // i는 가변으로 설정(밑에서 변함)
    var i = 1
    while (i <= 3) {
        println(i)
        i++
    }
}