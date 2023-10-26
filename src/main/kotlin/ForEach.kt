fun main() {
    val names = listOf("Habib","John", "Jane", "Joe")
    names.forEach { println(it) }
    names.forEachIndexed { index, name -> println("$index = $name") }
}