fun main() {
    val name1 = "Mo"
    val name2 = "Habib"

    val name3 = "Mo"

    println("name1 == name2: ${name1 == name2}")
    println("name1 === name3: ${name1 === name3}") // check memory address
    println("name1.equals(name2): ${name1.equals(name2)}")
    println("name1.compareTo(name2): ${name1.compareTo(name2)}")
    println("name1.compareTo(name3): ${name1.compareTo(name3)}")
    println("name1.compareTo(name3, true): ${name1.compareTo(name3, true)}")
    println("name1.compareTo(name3, false): ${name1.compareTo(name3, false)}")
    println("name1.compareTo(name2, true): ${name1.compareTo(name2, true)}")
    println("name1.compareTo(name2, false): ${name1.compareTo(name2, false)}")
}