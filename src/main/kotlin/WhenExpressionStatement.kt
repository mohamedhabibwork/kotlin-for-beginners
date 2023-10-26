fun main() {
    val gender = "F"

    when(gender){
        "F"-> println("FEMALE")
        "M"-> println("MALE")
        else -> println("UNKNOWN")
    }

    val input = "M"

    val result = when(input){
        "M"->"MALE"
        "F"->"FEMALE"
        else -> "UNKNOWN"
    }

    println("result = $result")

}