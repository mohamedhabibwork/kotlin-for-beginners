fun main() {
    val letters = charArrayOf(
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'
    )

    for (i in letters.indices) {
        println("letters[$i] = ${letters[i]}")
        println("letters[$i] = ${letters[i].uppercase()}")

    }

}