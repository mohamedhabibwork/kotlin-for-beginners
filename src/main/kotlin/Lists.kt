fun main() {
    val list: List<Int> = listOf(1, 2, 3, 4, 5)
    println("list = $list")
    val names = listOf("habib","John", "Jane", "Joe")
    println("names = $names")
    println("names contains John = ${names.contains("John")}")
    println("names contains Habib = ${names.contains("Habib")}")
    println("names.first = ${names.first()}")
    println("names.last = ${names.last()}")
    println("names[2] = ${names.get(2)}")
}