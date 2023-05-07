import java.lang.IllegalArgumentException

fun main(){

    Person2()
}

class Person2 (
     name: String = "yh",
    var age: Int = 21
) {

//    val name = name
//        get() = field.uppercase()

//    fun getUppercaseName(): String = this.name.uppercase()

    var name: String = name
        set(value) {
            field = value.uppercase()
        }

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age} 일 수 없습니다")
        }
        println("초기화 블록")
        println(isAdult)
        println("${this.name}")
    }

//    constructor(name: String): this(name, 1) {
//        println("첫 번째 부생성자")
//    }
//    constructor(): this("홍길동") {
//        println("두 번째 부생성자")
//    }

//    fun isAdult(): Boolean = this.age >= 20

    val isAdult: Boolean
        get() = this.age >= 20

}