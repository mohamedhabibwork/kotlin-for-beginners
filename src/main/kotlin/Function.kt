fun main() {
    val names = listOf("Habib","John", "Jane", "Joe")
    for (name in names) {
        val age = (0..100).random()
        greet(name, age)
        foo { println(it) }
        val (name2, age2) = pairValues()
        println("name = $name2")
        println("age = $age2")
        val (name3, age3, pi) = tripleValue()
        println("name = $name3")
        println("age = $age3")
        println("pi = $pi")
    }
}

fun pairValues() : Pair<String, Int> {
    return "Habib" to 21
}
fun tripleValue():Triple<String, Int, Double> {
    return Triple("Habib", 21, 3.14)
}
fun foo(bar:(String) -> Unit) {
    bar("Hello")
}
fun greet(name: String, age:Int) : Unit {
    println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
    println("Hello, $name")
    println("You are $age years old")
    if (age >= 21) {
        println("You are old enough to drink")
    } else {
        println("You are not old enough to drink")
    }

    if (age >= 16) {
        println("You are old enough to drive")
    } else {
        println("You are not old enough to drive")
    }

    if (age >= 18) {
        println("You are old enough to vote")
    } else {
        println("You are not old enough to vote")
    }

}