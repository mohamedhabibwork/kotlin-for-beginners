fun main() {
    val names = listOf("Habib","John", "Jane", "Joe")
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    println("normal for loop")
    for (name in names) {
        println(name.replaceFirstChar { it.uppercase() })
        println(name.replaceRange(0..0, name[1].uppercase()))
    }

    println("normal for loop")
    for (number in numbers) {
        println(number)
    }


}