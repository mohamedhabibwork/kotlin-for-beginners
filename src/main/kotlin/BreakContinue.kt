fun main() {
    val nums = 1..12
    for (num in nums) {
        if (num % 3 == 0) continue
        if (num == 11) break
        println(num)
    }

}