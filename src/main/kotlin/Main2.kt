fun main() {
    // 타입변환을 명시적으로 해줘야함
    /*
    val number1 = 3
    val number2: Long = number1.toLong()
    println(number2)
     */
    // number1이 null일 수 있으므로 safeCall, Elvis연산자 써야함
    val number1: Int? = 3
    val number2: Long = number1?.toLong() ?: 0L

    val person = Person("최태현", 100)

    println("이름 : ${person.name}")

    val name = "양현"

    println("이름 : $name")

    val name2 = "양미진"

    val str = """
     ABCD
        EFG
        ${name2}
    """.trimIndent()
    println(str)

    var str2 = "ABC"
    println(str[0])
    println(str[2])

    printAgeIfPerson(Person("김아무개", 120))
}

fun printAgeIfPerson(obj: Any?) {
    // obj != null Person으로 변환, obj = null 전체가 null
    val person = obj as? Person
    println(person?.age)
}

