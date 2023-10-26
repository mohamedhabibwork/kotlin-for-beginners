fun main() {
    val names = kotlin.arrayOf(
        "John",
        "Jane",
        "Mary",
        "Mark",
        "Bob"
    )
    println(names)
    println("names = ${names.contentToString()}")

    println("names[0] = ${names[0]}")
    names[0]= "John Doe"
    println("names[0] = ${names[0]}")

    println("size of names = ${names.size}")
    if (names.isEmpty()) {
        println("names is empty")
    }

    if ("habib" in names)  println("habib is in names")
    else println("habib is not in names")

    val arrayOfNulls: Array<String?> = arrayOfNulls(5)


    println("arrayOfNulls = ${arrayOfNulls.contentToString()}")
    arrayOfNulls.fill("habib")
    println("arrayOfNulls = ${arrayOfNulls.contentToString()}")
}