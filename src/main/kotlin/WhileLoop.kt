fun main() {
    var num = 1
    while (num <= 5) {
        println(num)
        num = num.inc()
    }
    val brand = "Habib"
    var index = brand.length - 1
    while (index >= 0) {
        println("index = ${brand[index].uppercase()}")
        index = index.dec()
    }
    val brandArray = brand.toCharArray()

    index = brandArray.size - 1
    while (index >= 0) {
        println("index = ${brandArray[index].uppercase()}")
        index = index.dec()
    }
}