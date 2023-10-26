fun main() {
    val n1 = 7
    val n2 = 10

    when {
        n1 > n2 -> {
            println("n1 is greater than n2")
        }
        n1 < n2 -> {
            println("n1 is less than n2")
        }
        n1 >= n2 -> {
            println("n1 is greater than or equal to n2")
        }
    }

    val age = 18
    when (age) {
        in 17 .. 19 -> {
            println("You are almost an adult")
        }
        in 13 .. 16 -> {
            println("You are a teenager")
        }
        in 0 .. 12 -> {
            println("You are a child")
        }
        else -> {
            println("You are an adult")
        }
    }

}