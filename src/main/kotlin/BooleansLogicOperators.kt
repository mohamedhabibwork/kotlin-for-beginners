fun main() {
    val isAdult = true
    val isMale = false
    val isStudent = false

    println("isAdult = $isAdult")
    println("isMale = $isMale")
    println("isStudent = $isStudent")

    println("isAdult and isMale = ${isAdult.and(isMale)}")
    println("isAdult or isMale = ${isAdult.or(isMale)}")
    println("isAdult xor isMale = ${isAdult.xor(isMale)}")
    println("isAdult xor isStudent = ${isAdult.xor(isStudent)}")
    println("isAdult.not() = ${isAdult.not()}")
    println("isMale.not() = ${isMale.not()}")
    println("isStudent.not() = ${isStudent.not()}")

}