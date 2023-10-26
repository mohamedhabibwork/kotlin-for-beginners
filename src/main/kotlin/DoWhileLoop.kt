fun main() {
    val names = listOf("Habib","John", "Jane", "Joe")
    var index = 0
    do {
        println("names[$index] = ${names[index]}")
        index++
    } while (index < names.size)
}