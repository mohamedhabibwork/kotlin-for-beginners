fun main() {
    val isAdult = true
    val isStudent = false
    println("isAdult = $isAdult")
    println("isStudent = $isStudent")

    val isAdult2 = isAdult.not()

    println("isAdult2 = $isAdult2")

    val isAdult3 = isAdult.and(isStudent)

    println("isAdult3 = $isAdult3")
}