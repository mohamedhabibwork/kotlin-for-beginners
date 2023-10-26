import java.util.*

fun main() {
    val name = "Habib" // read-only final
    println("Name: ${name.uppercase()}")
    println("Name: ${name.lowercase()}")
    println("Name: ${name.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }}")
    println("Name: ${name.replaceFirstChar { it.lowercase(Locale.getDefault()) }}")
    println("Name: ${name.reversed()}")
    println("Name: ${name.length}")
    println("".isEmpty())
    println("".isBlank())
    println("".isNotEmpty())
    println("".isNotBlank())
    println("".isNullOrBlank())
    println("".isNullOrEmpty())
    val age = 30
    println("Age: ${age.toString()}")
    println("Age: ${age.toString().reversed()}")
    println("Age: ${age.toString().length}")
    println("Name: $name $age")

    val email = """
        |Dear %s,
        |Your age is %d.
        |Thanks
    """

    println("")
    println(email.format("Mo",50).trimMargin())
    println("")
    println(email.format(name,age).replace("|","").trimIndent())
    println("")

    // accessed from another file
    println("PI: $PI")
}