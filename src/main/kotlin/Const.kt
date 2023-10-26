const val PI = 3.14 // static final

fun main() {
    val name = "Habib" // read-only final
    var i = 0 // mutable
    println("Name: $name")
    println("i: $i")
    i = 1
    println("i: $i")

    println("PI: $PI")
}