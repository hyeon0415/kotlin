
fun main(args: Array<String>) {
    // 타입변환을 명시적으로 해주자
//    val number1 = 3
//    val number2: Long = number1.toLong()
//    println(number2)

    // number1이 null일 수 있으므로 safeCall, Elvis연산자!!
    /*
    val number1: Int? = 3
    val number2: Long = number1?.toLong() ?: 0L
    println(number2)
     */

    val person = Person("최태현", 100)
    println("이름 : ${person.name}")

    val name = "양현"
    println("이름 : ${name}")

    val name2 = "양미진"
    var str = """
        ABCD
        EFG
        ${name2}
    """.trimIndent()
    println(str)

    var str2 = "ABC"
    println(str2[0])
    println(str2[2])

    printAgeIfPerson2(Person("Kim", 240))
}

fun printAgeIfPerson2(obj: Any?) {
    // obj가 null이 아니면 Person으로 변환, null이면 전체가 null
    val person = obj as? Person
    println("My age is ${person?.age} and my Name is ${person?.name}")

}


