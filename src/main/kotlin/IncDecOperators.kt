fun main() {
    var num1 = 10
    println("num1++ = ${num1.inc()}")
    println("++num1 = ${num1.inc()}")
    println("num1-- = ${num1.dec()}")
    println("--num1 = ${num1.dec()}")

    println("num1++ = ${num1++}")
    println("num1 = $num1")
    println("++num1 = ${++num1}")

    println("num1-- = ${num1--}")
    println("num1 = $num1")
    println("--num1 = ${--num1}")
}