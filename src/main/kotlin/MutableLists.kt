fun main() {
    val names = mutableListOf("Habib","John", "Mark", "Bob")
    println("names = $names")

    names.add("Jane")
    println("names = $names")

    names.add(1,"Mary")

    println("names = $names")

    names.remove("John")

    println("names = $names")

    names.removeAt(1)

    println("names = $names")

    names[0] = "Habib"

    println("names = $names")


    val numbers = mutableListOf(1, 2, 3, 4, 5)

    println("numbers = $numbers")

    numbers.addAll(listOf(6, 7, 8))

    println("numbers = $numbers")

    numbers.addAll(2, listOf(9, 10))

    println("numbers = $numbers")


    val names2 = mutableListOf("Habib","John", "Mark", "Bob")

    println("names2 = $names2")

    names2 += "Jane"

    println("names2 = $names2")

    names2 += listOf("Mary", "Sara")

    println("names2 = $names2")

    names2 -= "John"

    println("names2 = $names2")

    names2 -= listOf("Mark", "Bob")

    println("names2 = $names2")

}