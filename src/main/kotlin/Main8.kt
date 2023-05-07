import java.lang.IllegalArgumentException

fun main() {
//    val person = Person("양현")

//    println(person.name)
//    person.age = 10
//    println(person.age)
//    Person()
}

class Person (
    // name은 custom getter사용하기 위해 val 지움
     name: String = "양현",
    var age: Int = 1
) {

    //val name = name
        // 무한루프를 막기 위한 예약어, 자기 자신을 가르킨다 (backing field)
        //get() = field.uppercase()

//    fun getUppercaseName(): String = this.name.uppercase()


//    val uppercaseName: String
//        get() = this.name.uppercase()
    // 이름을 set할때 무조건 대문자
    var name: String = name
        set(value) {
            field = value.uppercase()
        }

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age} 일 수 없습니다")
        }
        println("초기화 블록")
    }

    // 부생성자 : 생성자를 추가하고 싶을 때 사용, this가 위에 있는 주생성자를 호출한다는 의미
    // 코틀린은 부생성자보단 defalut parameter를 권장하지만 converting해야 하는 경우는 부생성자 사용
//    constructor(name: String): this(name, 1) {
//        println("첫 번째 부생성자")
//    }
//
//    constructor(): this("홍길동") {
//        println("두 번째 부생성자")
//    }

    // 함수처럼 만들거나
//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }
    // 프로퍼티처럼 만들거나 (custom getter) .. 객체의 속성을 나타내는 것이라면.. 그렇지 않다면 함수
    val isAdult: Boolean
        get() = this.age >= 20
}

